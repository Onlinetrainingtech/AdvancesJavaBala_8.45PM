package com.example.SpringBootJ4MySQL.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringBootJ4MySQL.model.User;


public interface UserRepository extends CrudRepository<User, Long> {
}