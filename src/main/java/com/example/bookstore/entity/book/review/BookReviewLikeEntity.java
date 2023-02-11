package com.example.bookstore.entity.book.review;

import com.example.bookstore.entity.BaseEntity;
import com.example.bookstore.entity.user.UserEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "book_review_like")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class BookReviewLikeEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_review_id")
    private BookReviewEntity review;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(columnDefinition = "TIMESTAMP NOT NULL")
    @EqualsAndHashCode.Include
    private LocalDateTime time;

    @Column(columnDefinition = "SMALLINT NOT NULL")
    @EqualsAndHashCode.Include
    private Short value;
}
