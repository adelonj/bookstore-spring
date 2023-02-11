package com.example.bookstore.entity.book.links;

import com.example.bookstore.entity.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "book2user")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class Book2UserEntity extends BaseEntity {

    @Column(columnDefinition = "TIMESTAMP NOT NULL")
    private LocalDateTime time;

    @Column(columnDefinition = "INT NOT NULL")
    private int typeId;

    @Column(columnDefinition = "INT NOT NULL")
    @EqualsAndHashCode.Include
    private int bookId;

    @Column(columnDefinition = "INT NOT NULL")
    @EqualsAndHashCode.Include
    private int userId;

}
