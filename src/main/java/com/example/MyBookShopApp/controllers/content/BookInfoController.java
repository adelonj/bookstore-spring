package com.example.MyBookShopApp.controllers.content;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class BookInfoController {
    BookService bookService;

    @Autowired
    public BookInfoController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books/slug/{id}")
    public String bookInfoPage(@PathVariable int id, Model model) {
        model.addAttribute("bookInfo", bookService.getBookById(id));
        return "books/slug";
    }
}
