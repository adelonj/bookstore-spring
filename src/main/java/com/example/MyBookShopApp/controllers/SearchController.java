package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Author;
import com.example.MyBookShopApp.data.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchController {

    @GetMapping
    public String searchPage(){
        return "search/index";
    }

    @GetMapping("/{query}")
    public String searchPage(@PathVariable(required = false) String query, Model model){
        Book book = new Book(1, "1984", 300, 250, new Author(1, "Andrew", "Orwell","norm", "long story"));
        model.addAttribute("bookList", List.of(book));
        return "search/index";
    }

}
