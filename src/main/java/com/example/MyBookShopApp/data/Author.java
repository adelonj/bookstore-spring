package com.example.MyBookShopApp.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    private Integer id;
    private String firstName;
    private String lastName;
    private String bio;
    private String bioExtended;

    public String getFullName(){
        return lastName + " " + firstName;
    }

}
