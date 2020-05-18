package com.example.testeSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testeSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
