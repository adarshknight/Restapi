package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Author;
@Repository
public interface AutorRepo extends JpaRepository<Author,Integer>{
    
}
