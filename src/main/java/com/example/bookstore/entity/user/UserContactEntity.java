package com.example.bookstore.entity.user;

import com.example.bookstore.entity.BaseEntity;
import com.example.bookstore.entity.enums.ContactType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_contact")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class UserContactEntity extends BaseEntity {

    @Column(columnDefinition = "INT NOT NULL")
    @EqualsAndHashCode.Include
    private int userId;

    private ContactType type;

    @Column(columnDefinition = "SMALLINT NOT NULL")
    private short approved;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    @EqualsAndHashCode.Include
    private String code;

    @Column(columnDefinition = "INT")
    private int codeTrails;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime codeTime;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    @EqualsAndHashCode.Include
    private String contact;
}
