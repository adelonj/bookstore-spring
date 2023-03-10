package com.example.bookstore.controller.content;

import com.example.bookstore.entity.AuthorEntity;
import com.example.bookstore.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/authors")
public class AuthorsController {

    private final AuthorService authorService;

    @Autowired
    public AuthorsController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/index")
    public String authorsPage(){
        return "/authors/index";
    }

    @GetMapping("/{id}")
    public String getAuthorInfo(Model model, @PathVariable Long id){
        model.addAttribute("authorInfo", authorService.findAuthorById(id));
        return "authors/slug";
    }

    @ModelAttribute("authorsMap")
    public Map<String, List<AuthorEntity>> authorsMap(){
        return authorService.getAuthorsMap();
    }

}
