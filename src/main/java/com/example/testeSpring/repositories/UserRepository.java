package com.example.testeSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testeSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
