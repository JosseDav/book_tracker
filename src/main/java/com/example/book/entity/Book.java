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
    
}
