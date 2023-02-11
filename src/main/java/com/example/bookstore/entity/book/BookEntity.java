package com.example.bookstore.entity.book;

import com.example.bookstore.entity.AuthorEntity;
import com.example.bookstore.entity.BaseEntity;
import com.example.bookstore.entity.book.links.Book2AuthorEntity;
import com.example.bookstore.entity.genre.GenreEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class BookEntity extends BaseEntity {
    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(columnDefinition = "INT NOT NULL")
    private Integer price;
    @Column(columnDefinition = "SMALLINT")
    private Short discount;
    @Column(columnDefinition = "VARCHAR(255)")
    private String image;
    @Column(name = "is_bestseller", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean isBestseller;
    @Column(name = "pub_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime pubDate;
    @Column(columnDefinition = "VARCHAR(255)")
    private String slug;
//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable(name = "book2author",
//            joinColumns = @JoinColumn(name = "book_id"),
//            inverseJoinColumns = @JoinColumn(name = "author_id"))
//    @ToString.Exclude
//    private List<AuthorEntity> authors = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "book2genre",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    @ToString.Exclude
    private List<GenreEntity> genres;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    @ToString.Exclude
    private Set<Book2AuthorEntity> book2Authors;

}
