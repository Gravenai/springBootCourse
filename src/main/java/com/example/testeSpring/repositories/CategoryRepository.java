package com.example.testeSpring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testeSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	

}
