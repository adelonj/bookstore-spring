package com.example.bookstore.entity.user;

import com.example.bookstore.entity.BaseEntity;
import com.example.bookstore.entity.enums.ContactType;
import io.swagger.models.auth.In;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;
    
    private ContactType type;

    @Column(columnDefinition = "SMALLINT NOT NULL")
    private Short approved;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    @EqualsAndHashCode.Include
    private String code;

    @Column(columnDefinition = "INT")
    private Integer codeTrails;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime codeTime;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    @EqualsAndHashCode.Include
    private String contact;
}
