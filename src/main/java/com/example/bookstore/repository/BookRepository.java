package com.example.bookstore.repository;

import com.example.bookstore.entity.book.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
    List<BookEntity> findTop15ByOrderByPriceDesc();
    List<BookEntity> findTop5ByOrderByPriceDesc();


}
