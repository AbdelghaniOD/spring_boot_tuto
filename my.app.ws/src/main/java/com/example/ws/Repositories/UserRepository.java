package com.example.ws.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ws.UserEntities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long >{
	
	
	//add new personalise methode pour la recherche
	UserEntity findByEmail(String email);

}
