package com.example.bookstore.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class BookshopErrorController implements ErrorController {

    @RequestMapping("/error")
    public String getErrorPath(HttpServletResponse response) {
        if(response.getStatus() == HttpStatus.NOT_FOUND.value())
             return "errors/404";
        return "index";

    }
}
