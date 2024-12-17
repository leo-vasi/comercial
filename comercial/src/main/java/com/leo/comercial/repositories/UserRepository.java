package com.leo.comercial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leo.comercial.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
