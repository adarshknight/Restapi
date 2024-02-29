package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{
    
}
