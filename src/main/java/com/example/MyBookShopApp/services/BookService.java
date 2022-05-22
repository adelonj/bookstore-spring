package com.example.MyBookShopApp.services;

import com.example.MyBookShopApp.data.Author;
import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.services.AuthorService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    private AuthorService authorService;

    @Autowired
    public BookService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> getBooksData() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM books", (rs, rowNum) -> setBookInfo(rs));
        return new ArrayList<>(books);
    }

    public List<Book> getPopularBooks() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM books limit 30", (rs, rowNum) -> setBookInfo(rs));
        return new ArrayList<>(books);
    }

    public List<Book> getTopPopularBooks() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM books order by title asc limit 25 ", (rs, rowNum) -> setBookInfo(rs));
        return new ArrayList<>(books);

    }

    public List<Book> getTopRecentBooks() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM books order by title desc limit 10 ", (rs, rowNum) -> setBookInfo(rs));
        return new ArrayList<>(books);
    }

    public List<Book> getTopRecommendedBooks() {
        List<Book> books = jdbcTemplate.query("SELECT * FROM books where price < 300 limit 15", (rs, rowNum) -> setBookInfo(rs));
        return new ArrayList<>(books);
    }

    public Book getBookById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM books where id = ?", (rs, rowNum) -> setBookInfo(rs), id);
    }

    private Book setBookInfo(ResultSet rs) throws SQLException {
        Book book = new Book();
        book.setId(rs.getInt("id"));
        int authorId = rs.getInt("author_id");
        if (authorId != 0) book.setAuthor(authorService.findAuthorById(authorId));
        book.setTitle(rs.getString("title"));
        book.setPriceOld(rs.getInt("price_old"));
        book.setPrice(rs.getInt("price"));
        return book;
    }

}
