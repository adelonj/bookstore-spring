package com.example.MyBookShopApp.services;

import com.example.MyBookShopApp.data.Author;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class AuthorService {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public AuthorService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Author findAuthorById(int id) {
        return jdbcTemplate.queryForObject("select * from authors where id = ?",
                (rs, rowNum) -> setAuthorInfo(rs), id);
    }

    public Map<String, List<Author>> getAuthorsMap() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors order by last_name", (rs, rowNum) -> setAuthorInfo(rs));
        return authors.stream().collect(Collectors.groupingBy((Author a) -> a.getLastName().substring(0,1)));
    }

    private Author setAuthorInfo(ResultSet rs) throws SQLException {
        Author author = new Author();
        author.setId(rs.getInt("id"));
        author.setLastName(rs.getString("last_name"));
        author.setFirstName(rs.getString("first_name"));
        String bio = rs.getString("bio");
        if(bio.length() > 500) {
            author.setBio(bio.substring(0, 500) + "...");
            author.setBioExtended(bio.substring(500));
        }
        return author;
    }


}
