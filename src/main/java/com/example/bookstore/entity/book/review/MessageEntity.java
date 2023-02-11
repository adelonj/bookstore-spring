package com.example.bookstore.entity.book.review;

import com.example.bookstore.entity.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "message")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class MessageEntity extends BaseEntity {

    @Column(columnDefinition = "TIMESTAMP NOT NULL")
    private LocalDateTime time;

    @Column(columnDefinition = "INT")
    @EqualsAndHashCode.Include
    private int userId;

    @Column(columnDefinition = "VARCHAR(255)")
    @EqualsAndHashCode.Include
    private String email;

    @Column(columnDefinition = "VARCHAR(255)")
    @EqualsAndHashCode.Include
    private String name;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String subject;

    @Column(columnDefinition = "TEXT NOT NULL")
    private String text;

}
