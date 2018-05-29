package com.baohao.departmentwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ArticleController {
    @RequestMapping(value = "/article/list", method = RequestMethod.GET)
    public String articleList(Model model) {
        return "article/list";
    }
}
