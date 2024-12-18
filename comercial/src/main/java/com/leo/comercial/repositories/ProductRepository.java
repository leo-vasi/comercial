package com.leo.comercial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leo.comercial.entities.Category;
import com.leo.comercial.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
