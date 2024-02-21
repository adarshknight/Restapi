package com.example.project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Book;
import com.example.project.model.Login;
import com.example.project.service.Bookservice;
import com.example.project.service.Loginservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
public class Bookcontroller {
    @Autowired Loginservice l;
    @Autowired Bookservice b;
    @GetMapping("/getlogin")
    public List <Login> getMethodName() {
        return l.get();
    }
    @GetMapping("/getbook")
    public List <Book> getMethod() {
        return b.get();
    }
    @PostMapping("/addlogin")
    public Login postMethodName(@RequestBody Login l1) {
        return l.post(l1);
    }
    @PostMapping("/addbook")
    public Book postMethodName(@RequestBody Book l2) {
        return b.post(l2);
    }
    @PutMapping("/putlogin/{id}")
    public Login putMethodName(@PathVariable int id, @RequestBody Login e1) {        
        return l.put(id, e1);
    }
    @PutMapping("/putbook/{id}")
    public Book putMethodName(@PathVariable int id, @RequestBody Book e2) {        
        return b.put(id, e2);
    }
    @DeleteMapping("/deletelogin/{id}")
    public String deletelogin(@PathVariable int id){
        return l.delete(id);
    }
    @DeleteMapping("/deletebook/{id}")
    public String deletebook(@PathVariable int id){
        return b.delete(id);
    }
    @GetMapping("/getlogin/{id}")
    public Optional <Login> getById (@PathVariable int id) {
        return l.getById(id);
    }
    @GetMapping("/getbook/{id}")
    public Optional <Book> getByid (@PathVariable int id) {
        return b.getByid(id);
    }
    
}
