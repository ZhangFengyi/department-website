package com.baohao.departmentwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewsController {
    @RequestMapping(value = "/news/list", method = RequestMethod.GET)
    public String newsList(Model model) {
        return "news/list";
    }
}
