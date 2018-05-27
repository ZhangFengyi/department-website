package com.baohao.departmentwebsite.service;

import com.baohao.departmentwebsite.dao.FnInfoMapper;
import com.baohao.departmentwebsite.model.FnInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FnService {
    @Resource
    private FnInfoMapper fnInfoMapper;

    public List<FnInfo> listFn() {
        List<FnInfo> fnInfoList = fnInfoMapper.selectByExample(null);
        return fnInfoList;
    }

    public void addFn(FnInfo add) {
        fnInfoMapper.insertSelective(add);
    }

    public void editFn(FnInfo edit) {
        fnInfoMapper.updateByPrimaryKeySelective(edit);
    }
}
