package com.example.bookstore.entity.book.file;

import com.example.bookstore.entity.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "book_file")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class BookFileEntity extends BaseEntity {
    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String hash;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    private BookFileTypeEntity fileType;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String path;
}

