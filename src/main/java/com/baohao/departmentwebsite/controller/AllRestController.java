package com.baohao.departmentwebsite.controller;

import com.baohao.departmentwebsite.common.util.EncryptUtils;
import com.baohao.departmentwebsite.controller.request.ManagerAddRequest;
import com.baohao.departmentwebsite.model.ManagerInfo;
import com.baohao.departmentwebsite.service.ManagerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AllRestController {
    @Resource
    private ManagerService managerService;

    @RequestMapping(value = "/manager/add", method = RequestMethod.POST)
    public ResultHolder userAdd(@RequestBody ManagerAddRequest newManager) {
        if (!StringUtils.equals(newManager.getPassword(), newManager.getConfirmPassword())) {
            return ResultHolder.error("两次输入密码不一致");
        }
        ManagerInfo existsManager = managerService.findManagerByEmail(newManager.getEmail());
        if (existsManager != null) {
            return ResultHolder.error("邮箱已存在");
        }
        ManagerInfo addManager = new ManagerInfo();
        addManager.setMagEmail(newManager.getEmail());
        addManager.setMagName(newManager.getUsername());
        addManager.setMagPsw(EncryptUtils.md5Encrypt(newManager.getPassword()).toString());
        managerService.addManager(addManager);
        return ResultHolder.success(null);
    }
}
