package com.example.bookstore.repository;

import com.example.bookstore.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity, Long> {
    List<AuthorEntity> findAllByOrderByLastNameAsc();

}
