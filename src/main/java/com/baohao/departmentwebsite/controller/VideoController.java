package com.baohao.departmentwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VideoController {
    @RequestMapping(value = "video/list", method = RequestMethod.GET)
    public String listVideo(Model model) {
        return "video/list";
    }

    @RequestMapping(value = "video/group/list", method = RequestMethod.GET)
    public String listVideoGroup(Model model) {
        return "video-group/list";
    }
}
