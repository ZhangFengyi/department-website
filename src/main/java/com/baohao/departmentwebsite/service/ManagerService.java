package com.baohao.departmentwebsite.service;

import com.baohao.departmentwebsite.dao.ManagerInfoMapper;
import com.baohao.departmentwebsite.model.ManagerInfo;
import com.baohao.departmentwebsite.model.ManagerInfoExample;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManagerService {
    @Resource
    private ManagerInfoMapper managerInfoMapper;

    public ManagerInfo findManagerByEmail(String email) {
        ManagerInfoExample example = new ManagerInfoExample();
        example.createCriteria().andMagEmailEqualTo(email);
        List<ManagerInfo> managerInfoList = managerInfoMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(managerInfoList)) {
            return null;
        }

        return managerInfoList.get(0);
    }

    public void addManager(ManagerInfo addManager) {
        managerInfoMapper.insertSelective(addManager);
    }

}
