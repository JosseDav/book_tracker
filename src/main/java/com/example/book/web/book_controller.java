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
import org.springframework.web.bind.annotation.PostMapping;

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
        Book book = bookrepo.findById(0);
        model.put("book", book);
        return "something";
    }
    @GetMapping("/allbooks")
    public String get_all_books(ModelMap model){
        List<Book> allBooks = bookrepo.findAll();
        allBooks.forEach(book -> {
            System.out.println(book);
        });
        model.put("allBooks", allBooks);
        return "show_all";
    }
    @GetMapping("/error")
    public void error(){
        System.out.println("OKAY THERE WAS AN ERROR BUT YOU HAVE IT WORKING NERD");
    }
}
