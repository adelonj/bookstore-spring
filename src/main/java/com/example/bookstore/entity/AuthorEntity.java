package com.example.bookstore.entity;

import com.example.bookstore.entity.book.BookEntity;
import com.example.bookstore.entity.book.links.Book2AuthorEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "author")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class AuthorEntity extends BaseEntity{
    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "VARCHAR(255)")
    private String photo;

    @Column(columnDefinition = "VARCHAR(255)")
    private String slug;

//    @ManyToMany(mappedBy = "authors", fetch = FetchType.LAZY)
//    private List<BookEntity> books = new ArrayList<>();
    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    @ToString.Exclude
    private Set<Book2AuthorEntity> book2Authors;
}

