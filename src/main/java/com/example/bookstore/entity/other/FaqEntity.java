package com.example.bookstore.entity.other;

import com.example.bookstore.entity.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "faq")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class FaqEntity extends BaseEntity {

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    @EqualsAndHashCode.Include
    private String question;

    @Column(columnDefinition = "TEXT NOT NULL")
    @EqualsAndHashCode.Include
    private String answer;

    @Column(columnDefinition = "INT NOT NULL  DEFAULT 0")
    private Integer sortIndex;

}
