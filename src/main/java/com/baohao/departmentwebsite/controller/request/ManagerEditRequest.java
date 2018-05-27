package com.baohao.departmentwebsite.controller.request;

import com.baohao.departmentwebsite.model.ManagerInfo;

public class ManagerEditRequest extends ManagerInfo {
    private String confirmPassword;

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
