package com.baohao.departmentwebsite.service;

import com.baohao.departmentwebsite.dao.FnInfoMapper;
import com.baohao.departmentwebsite.dao.SnInfoMapper;
import com.baohao.departmentwebsite.model.FnInfo;
import com.baohao.departmentwebsite.model.FnInfoExample;
import com.baohao.departmentwebsite.model.SnInfo;
import com.baohao.departmentwebsite.model.SnInfoExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuService {
    @Resource
    private FnInfoMapper fnInfoMapper;

    @Resource
    private SnInfoMapper snInfoMapper;

    public List<FnInfo> listFn() {
        FnInfoExample example = new FnInfoExample();
        example.setOrderByClause("`fn_number` ASC, `fn_id` ASC");
        List<FnInfo> fnInfoList = fnInfoMapper.selectByExample(example);
        return fnInfoList;
    }

    public void addFn(FnInfo add) {
        fnInfoMapper.insertSelective(add);
    }

    public void editFn(FnInfo edit) {
        fnInfoMapper.updateByPrimaryKeySelective(edit);
    }

    public List<SnInfo> listSn() {
        SnInfoExample example = new SnInfoExample();
        example.setOrderByClause("`sn_number` ASC, `fn_id` ASC");
        List<SnInfo> snInfoList = snInfoMapper.selectByExample(example);
        return snInfoList;
    }

    public void addSn(SnInfo add) {
        snInfoMapper.insertSelective(add);
    }

    public void editSn(SnInfo edit) {
        snInfoMapper.updateByPrimaryKeySelective(edit);
    }
}
