package com.baohao.departmentwebsite.service;

import com.baohao.departmentwebsite.dao.ImageInfoMapper;
import com.baohao.departmentwebsite.model.ImageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImageService {
    @Resource
    private ImageInfoMapper imageInfoMapper;

    public List<ImageInfo> listImage() {
        List<ImageInfo> imageInfoList = imageInfoMapper.selectByExample(null);
        return imageInfoList;
    }

    public void addImage(ImageInfo add) {
        imageInfoMapper.insertSelective(add);
    }

    public void editImage(ImageInfo edit) {
        imageInfoMapper.updateByPrimaryKeySelective(edit);
    }
}
