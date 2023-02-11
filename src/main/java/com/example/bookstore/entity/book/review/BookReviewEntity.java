package com.example.bookstore.entity.book.review;

import com.example.bookstore.entity.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "book_review")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class BookReviewEntity extends BaseEntity {

    @Column(columnDefinition = "INT NOT NULL")
    @EqualsAndHashCode.Include
    private int bookId;

    @Column(columnDefinition = "INT NOT NULL")
    @EqualsAndHashCode.Include
    private int userId;

    @Column(columnDefinition = "TIMESTAMP NOT NULL")
    private LocalDateTime time;

    @Column(columnDefinition = "TEXT NOT NULL")
    private String text;

}
