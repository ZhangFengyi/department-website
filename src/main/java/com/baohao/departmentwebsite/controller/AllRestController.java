package com.baohao.departmentwebsite.controller;

import com.baohao.departmentwebsite.common.util.EncryptUtils;
import com.baohao.departmentwebsite.controller.request.ManagerAddRequest;
import com.baohao.departmentwebsite.controller.request.ManagerEditRequest;
import com.baohao.departmentwebsite.controller.request.ManagerListRequest;
import com.baohao.departmentwebsite.model.ManagerInfo;
import com.baohao.departmentwebsite.service.ManagerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

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
        Date date = new Date();
        date.setTime(System.currentTimeMillis());
        addManager.setCreateTime(date);
        managerService.addManager(addManager);
        return ResultHolder.success(null);
    }

    @RequestMapping(value = "manager/list", method = RequestMethod.POST)
    public ResultHolder listManager(@RequestBody ManagerListRequest request) {
        try {
            List<ManagerInfo> managerInfoList = managerService.listManager();
            return ResultHolder.success(managerInfoList);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "manager/edit", method = RequestMethod.POST)
    public ResultHolder editManager(@RequestBody ManagerEditRequest request) {
        try {
            ManagerInfo existsManager = managerService.findManagerByEmail(request.getMagEmail());
            if (existsManager != null) {
                return ResultHolder.error("邮箱已存在");
            }
            ManagerInfo editManager = new ManagerInfo();
            editManager.setMagId(request.getMagId());
            editManager.setMagEmail(request.getMagEmail());
            editManager.setMagName(request.getMagName());
            Date date = new Date();
            date.setTime(System.currentTimeMillis());
            editManager.setUpdateTime(date);
            managerService.editManager(editManager);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }
}
