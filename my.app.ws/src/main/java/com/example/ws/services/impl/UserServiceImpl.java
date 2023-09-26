package com.example.ws.services.impl;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.ws.Repositories.UserRepository;
import com.example.ws.UserEntities.UserEntity;
import com.example.ws.services.UserService;
import com.example.ws.shared.Utils;
import com.example.ws.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Utils util;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public UserDto createUser(UserDto user) {
		UserEntity checkUser=userRepository.findByEmail(user.getEmail());
		if(checkUser!=null) throw new RuntimeException("User already exists");
		
		UserEntity userEntity=new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		//pour donner une valeur 
		userEntity.setUserId(util.generateUserId(32));
		userEntity.setEncryptpass(bCryptPasswordEncoder.encode(user.getPassword()));
			
		UserEntity newUser=userRepository.save(userEntity);
		UserDto userDto=new UserDto();
		
		BeanUtils.copyProperties(newUser, userDto);
		
		
		return userDto;
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserEntity userEntity= userRepository.findByEmail(email);
		if(userEntity==null) throw new UsernameNotFoundException(email);
		return new User(userEntity.getEmail(), userEntity.getEncryptpass(), new ArrayList<>());
	}

}
