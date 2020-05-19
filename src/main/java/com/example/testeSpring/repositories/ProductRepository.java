package com.example.testeSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testeSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
