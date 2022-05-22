package com.example.MyBookShopApp.controllers.content;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/genres")
public class GenresController {

    @GetMapping("/index")
    public String genresPage(){
        return "genres/index";
    }

    @GetMapping("/slug")
    public String getInfo(){
        return "genres/slug";
    }
}
