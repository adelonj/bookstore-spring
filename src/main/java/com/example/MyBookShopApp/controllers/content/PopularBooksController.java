package com.example.MyBookShopApp.controllers.content;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class PopularBooksController {
    BookService bookService;

    @Autowired
    public PopularBooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("booksList")
    public List<Book> popularBooks(){
        return bookService.getPopularBooks();
    }

    @GetMapping("/books/popular")
    public String popularBookPage(){
        return "books/popular";
    }

}
