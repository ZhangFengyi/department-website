package com.baohao.departmentwebsite.controller;

import com.baohao.departmentwebsite.common.constant.SessionConstants;
import com.baohao.departmentwebsite.model.ManagerInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        Subject subject = SecurityUtils.getSubject();
        ManagerInfo manager = (ManagerInfo) subject.getSession().getAttribute(SessionConstants.ATTR_USER);
        if (manager == null) {
            return "login";
        } else {
            return "redirect:/";
        }
    }

}
