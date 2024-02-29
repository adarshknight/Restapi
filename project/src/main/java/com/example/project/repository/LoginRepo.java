package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Login;

public interface LoginRepo extends JpaRepository<Login,Integer>{
    
}
