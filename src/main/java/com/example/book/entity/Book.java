/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.book.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author josse
 */
@Entity
@Table(name="book_info")
public class Book implements Serializable {
    private String title;
    private int id;
    private String author;
    private String genre;
    private int rating;
    
    @Id
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int rating){
        if (rating >= 5){
            this.rating = 5;
        }
        else{
            this.rating = rating;
        }
    }
}
