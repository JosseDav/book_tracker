/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import Repository.BookRepository;
import entity.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author josse
 */
public class controller {
    BookRepository bookRepo;
    
    @Autowired
    public controller(BookRepository bookRepo){
        this.bookRepo = bookRepo;
    }
    @GetMapping("/")
    public String root(ModelMap model){
        List<Book> allUsers = bookRepo.findAll();
        Book user = new Book();
        model.put("allUsers", allUsers);
        model.put("user", user);
        return "login";
    }
}
