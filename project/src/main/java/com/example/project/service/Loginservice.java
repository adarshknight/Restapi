package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Login;
import com.example.project.repository.LoginRepo;

@Service
public class Loginservice {
    @Autowired LoginRepo repo;
    public Login post(Login l){
        return repo.save(l);
    }
    public List<Login> get(){
        return repo.findAll();
    }
    public Optional<Login> getById(int id){
        return repo.findById(id);
    }
    public String delete(int id){
        repo.deleteById(id);
        return "Deleted";
    }
    public Login put(int id,Login bo){
        Login b=repo.findById(id).orElse(null);
        if(b!=null){
            b.setUsername(bo.getUsername());
            b.setPassword(bo.getPassword());
            return repo.saveAndFlush(b);
        }
        else{
            return null;
        }
    }
}
