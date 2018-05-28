package com.baohao.departmentwebsite.controller;

import com.baohao.departmentwebsite.dao.FnInfoMapper;
import com.baohao.departmentwebsite.dao.SnInfoMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MenuController {
    @Resource
    private FnInfoMapper fnInfoMapper;

    @Resource
    private SnInfoMapper snInfoMapper;

    @RequestMapping(value = "/fn/list")
    public String fnList(Model model) {
        return "fn/list";
    }

    @RequestMapping(value = "sn/list", method = RequestMethod.GET)
    public String snList(Model model) {
        return "sn/list";
    }
}
