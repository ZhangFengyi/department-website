package com.baohao.departmentwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ImageController {
    @RequestMapping(value = "image/list", method = RequestMethod.GET)
    public String imageList(Model model) {
        return "image/list";
    }
}
