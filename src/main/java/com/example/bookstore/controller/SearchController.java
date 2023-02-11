package com.example.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/search")
public class SearchController {

    @GetMapping
    public String searchPage(){
        return "search/index";
    }

    @GetMapping("/{query}")
    public String searchPage(@PathVariable(required = false) String query, Model model){
//        BookEntity book = new BookEntity(1, "1984", 300, 250, new AuthorEntity(1L, "Andrew", "Orwell","norm", null));
//        model.addAttribute("bookList", List.of(book));
        return "search/index";
    }

}
