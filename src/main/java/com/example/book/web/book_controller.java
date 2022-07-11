/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.book.web;

import com.example.book.entity.Book;
import com.example.book.repo.bookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author josse
 */
@Controller
public class book_controller {
    private final bookRepository bookrepo;
    
    @Autowired
    public book_controller(bookRepository bookrepo){
        this.bookrepo = bookrepo;
    }
    
    @GetMapping("/")
    public String root(ModelMap model){
        List<Book> allUsers = bookrepo.findAll();
        Book user = new Book();
        model.put("allUsers", allUsers);
        model.put("user", user);
        return "something";
    }
    @GetMapping("/error")
    public void error(){
        System.out.println("OKAY THERE WAS AN ERROR BUT YOU HAVE IT WORKING NERD");
    }
}
