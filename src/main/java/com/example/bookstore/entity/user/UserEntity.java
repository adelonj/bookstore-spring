package com.example.bookstore.entity.user;

import com.example.bookstore.entity.BaseEntity;
import io.swagger.models.auth.In;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    @EqualsAndHashCode.Include
    private String hash;

    @Column(name="reg_time", columnDefinition = "TIMESTAMP NOT NULL")
    @EqualsAndHashCode.Include
    private LocalDateTime regTime;

    @Column(columnDefinition = "INT NOT NULL")
    private Integer balance;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    @EqualsAndHashCode.Include
    private String name;

}
