package com.example.bookstore.controller.content;

import com.example.bookstore.entity.BookEntity;
import com.example.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class RecentBooksController {
    private final BookService bookService;

    @Autowired
    public RecentBooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("booksList")
    public List<BookEntity> recentBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/books/recent")
    public String recentBookPage(){
        return "books/recent";
    }
}
