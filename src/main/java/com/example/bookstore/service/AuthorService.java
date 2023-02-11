package com.example.bookstore.service;

import com.example.bookstore.entity.AuthorEntity;
import com.example.bookstore.repository.AuthorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class AuthorService {
    private final AuthorRepository repository;

    @Autowired
    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public AuthorEntity findAuthorById(Long id) {
        return repository.findById(id).orElseThrow(()-> new RuntimeException("Author not found"));
    }

    public Map<String, List<AuthorEntity>> getAuthorsMap() {
        List<AuthorEntity> authors = repository.findAllByOrderByNameAsc();
        return authors.stream().
                collect(Collectors.groupingBy((AuthorEntity a) -> a.getName().substring(0,1)));
    }

}
