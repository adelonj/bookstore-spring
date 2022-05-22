package com.example.MyBookShopApp.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Integer id;
    private String title;
    private Integer priceOld;
    private Integer price;
    private Author author;

}
