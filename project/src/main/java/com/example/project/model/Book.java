package com.example.project.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class Book{
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String bookname;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="bookid")
    private Author author1;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public Author getAuthor1() {
        return author1;
    }
    public void setAuthor1(Author author1) {
        this.author1 = author1;
    }
    
}