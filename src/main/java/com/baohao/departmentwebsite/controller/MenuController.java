package com.baohao.departmentwebsite.controller;

import com.baohao.departmentwebsite.dao.FnInfoMapper;
import com.baohao.departmentwebsite.dao.SnInfoMapper;
import com.baohao.departmentwebsite.model.FnInfo;
import com.baohao.departmentwebsite.model.FnInfoExample;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        FnInfoExample example = new FnInfoExample();
        example.setOrderByClause("`fn_number` ASC, `fn_id` ASC");
        List<FnInfo> fnInfoList = fnInfoMapper.selectByExample(example);
        model.addAttribute("fnInfoList", fnInfoList);
        return "fn/list";
    }
}
