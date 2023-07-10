package com.example.JPA.JPA.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "NewBookDb")
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    @Column(name = "authorName")
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookModel( String name, String author) {
        this.name = name;
        this.author = author;
    }

    public BookModel() {
    }

    @Override
    public String toString() {
        return "{"+this.id+" "+this.name+" "+this.author+ " }";
    }
}
