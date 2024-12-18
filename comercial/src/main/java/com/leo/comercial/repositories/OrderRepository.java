package com.leo.comercial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leo.comercial.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
