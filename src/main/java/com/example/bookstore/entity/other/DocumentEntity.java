package com.example.bookstore.entity.other;

import com.example.bookstore.entity.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "document")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class DocumentEntity extends BaseEntity {

    @Column(columnDefinition = "INT NOT NULL  DEFAULT 0")
    private int sortIndex;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    @EqualsAndHashCode.Include
    private String slug;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    @EqualsAndHashCode.Include
    private String title;

    @Column(columnDefinition = "TEXT NOT NULL")
    @EqualsAndHashCode.Include
    private String text;

}
