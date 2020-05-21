package com.example.testeSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testeSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
