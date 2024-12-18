package com.leo.comercial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leo.comercial.entities.OrderItem;
import com.leo.comercial.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	

}
