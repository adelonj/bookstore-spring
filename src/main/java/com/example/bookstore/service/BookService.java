package com.example.bookstore.service;

import com.example.bookstore.entity.BookEntity;
import com.example.bookstore.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository repository;

    public List<BookEntity> getBooks() {
        return repository.findAll();
    }

    public List<BookEntity> getPopularBooks() {
        return repository.findTop15ByOrderByPriceDesc();
    }

    public List<BookEntity> getTopPopularBooks() {
        return repository.findTop5ByOrderByPriceDesc();
    }

    public List<BookEntity> getTopRecentBooks() {
        return repository.findTop15ByOrderByPriceDesc();
    }

    public List<BookEntity> getTopRecommendedBooks() {
        return repository.findTop15ByOrderByPriceDesc();
    }

    public BookEntity getBookById(Long id) {
        return repository.findById(id).orElseThrow(()-> new RuntimeException("Book not found"));
    }

}
