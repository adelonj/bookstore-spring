package com.example.bookstore.entity.payments;

import com.example.bookstore.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "balance_transaction")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class BalanceTransactionEntity extends BaseEntity {

    @Column(columnDefinition = "INT NOT NULL")
    @EqualsAndHashCode.Include
    private int userId;

    @Column(columnDefinition = "TIMESTAMP NOT NULL")
    private LocalDateTime time;

    @Column(columnDefinition = "INT NOT NULL  DEFAULT 0")
    @EqualsAndHashCode.Include
    private int value;

    @Column(columnDefinition = "INT NOT NULL")
    @EqualsAndHashCode.Include
    private int bookId;

    @Column(columnDefinition = "TEXT NOT NULL")
    private String description;
}
