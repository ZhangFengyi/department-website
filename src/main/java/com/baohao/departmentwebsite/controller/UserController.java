package com.baohao.departmentwebsite.controller;

import com.baohao.departmentwebsite.dao.ManagerInfoMapper;
import com.baohao.departmentwebsite.dao.UserInfoMapper;
import com.baohao.departmentwebsite.model.ManagerInfo;
import com.baohao.departmentwebsite.model.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private ManagerInfoMapper managerInfoMapper;

    @Resource
    private UserInfoMapper userInfoMapper;

    @RequestMapping(value = "/manager/list", method = RequestMethod.GET)
    public String managerList(Model model) {
        List<ManagerInfo> managerInfoList = managerInfoMapper.selectByExample(null);
        model.addAttribute("managerInfoList", managerInfoList);
        return "manager/list";
    }

    @RequestMapping(value = "user/list", method = RequestMethod.GET)
    public String userList(Model model) {
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(null);
        model.addAttribute("userInfoList", userInfoList);
        return "user/list";
    }
}
