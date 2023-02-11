package com.example.bookstore.entity.book.file;

import com.example.bookstore.entity.BaseEntity;
import com.example.bookstore.entity.book.BookEntity;
import com.example.bookstore.entity.user.UserEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "file_download")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class FileDownloadEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private BookEntity bookEntity;

    @Column(columnDefinition = "INT NOT NULL DEFAULT 1")
    private Integer count;

}
