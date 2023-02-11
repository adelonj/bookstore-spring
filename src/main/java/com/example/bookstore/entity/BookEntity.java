package com.example.bookstore.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class BookEntity extends BaseEntity{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    //todo добавить полей
    @Column(name = "price")
    private String price;

    @Column(name = "price_old")
    private String priceOld;

    @Column(name = "title")
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private AuthorEntity author;


}
