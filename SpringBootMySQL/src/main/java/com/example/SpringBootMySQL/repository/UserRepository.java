package com.example.SpringBootMySQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.SpringBootMySQL.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
}