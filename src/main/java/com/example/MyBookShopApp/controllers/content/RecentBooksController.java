package com.example.MyBookShopApp.controllers.content;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class RecentBooksController {
    BookService bookService;

    @Autowired
    public RecentBooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("booksList")
    public List<Book> recentBooks(){
        return bookService.getBooksData();
    }

    @GetMapping("/books/recent")
    public String recentBookPage(){
        return "books/recent";
    }
}