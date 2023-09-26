package com.example.ws.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	
	UserDto createUser(UserDto userDto);

}
