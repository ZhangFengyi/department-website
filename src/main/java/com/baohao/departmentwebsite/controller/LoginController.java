package com.baohao.departmentwebsite.controller;

import com.baohao.departmentwebsite.common.constant.SessionConstants;
import com.baohao.departmentwebsite.model.ManagerInfo;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password, Model model) {
        String message;
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            message = "用户名和密码不能为空！";
            model.addAttribute("message", message);
            return "login";
        }
        try {
            UsernamePasswordToken token = new UsernamePasswordToken(StringUtils.trim(username), StringUtils.trim(password));
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            if (subject.isAuthenticated()) {
                return "redirect:/index";
            } else {
                return "login";
            }
        } catch (IncorrectCredentialsException | UnknownAccountException e) {
            message = "用户名或密码错误！";
        }
        model.addAttribute("message", message);
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout(Model model) {
        SecurityUtils.getSubject().logout();
        return new ModelAndView("login");
    }


    @RequestMapping("/403")
    public ModelAndView unauthorizedRole() {
        return new ModelAndView("/403");
    }
}
