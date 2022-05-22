package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class MainPageController {

    private final BookService bookService;

    @Autowired
    public MainPageController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("recommendedBooks")
    public List<Book> recommendedBooks(){
        return bookService.getTopRecommendedBooks();
    }

    @ModelAttribute("recentBooks")
    public List<Book> recentBooks(){
        return bookService.getTopRecentBooks();
    }

    @ModelAttribute("popularBooks")
    public List<Book> popularBooks(){
        return bookService.getTopPopularBooks();
    }

    @GetMapping("/")
    public String mainPage(){
        return "index";
    }
}
