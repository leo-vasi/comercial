package com.leo.comercial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leo.comercial.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
