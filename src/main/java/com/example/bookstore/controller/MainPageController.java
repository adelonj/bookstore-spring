package com.example.bookstore.controller;

import com.example.bookstore.entity.book.BookEntity;
import com.example.bookstore.service.BookService;
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
    public List<BookEntity> recommendedBooks(){
        return bookService.getTopRecommendedBooks();
    }

    @ModelAttribute("recentBooks")
    public List<BookEntity> recentBooks(){
        return bookService.getTopRecentBooks();
    }

    @ModelAttribute("popularBooks")
    public List<BookEntity> popularBooks(){
        return bookService.getTopPopularBooks();
    }

    @GetMapping("/")
    public String mainPage(){
        return "index";
    }
}
