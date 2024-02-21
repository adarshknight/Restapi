package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Book;
import com.example.project.repository.BookRepo;
import java.util.List;
import java.util.Optional;

@Service
public class Bookservice {
    @Autowired BookRepo repo;
    public Book post(Book b){
        return repo.save(b);
    }
    public List<Book> get(){
        return repo.findAll();
    }
    public Optional<Book> getByid(int id){
        return repo.findById(id);
    }
    public String delete(int id){
        repo.deleteById(id);
        return "deleted";
    }
    public Book put(int id,Book bo){
        Book b=repo.findById(id).orElse(null);
        if(b!=null){
            b.setId(bo.getId());
            b.setBookname(bo.getBookname());
            b.setAuthor(bo.getAuthor());
            b.setPrice(bo.getPrice());
            return repo.saveAndFlush(b);
        }
        else{
            return null;
        }
    }
}
