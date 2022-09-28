package com.boot.mybatis20220923min.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {

    @GetMapping("/news/newpost")
    public String loadWriteNews() {
        return "news/write";
    }

    @GetMapping("/auth/signup")
    public String loadAuthSignup() {
        return "auth/signup";
    }

    @GetMapping("/news/{id}")
    public String loadReadNews(@PathVariable int id) {
        return "news/read";
    }


}
