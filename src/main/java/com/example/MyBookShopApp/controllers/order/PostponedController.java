package com.example.MyBookShopApp.controllers.order;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/postponed")
public class PostponedController {
    @GetMapping
    public String postponedPage(){
        return "postponed";
    }
}
