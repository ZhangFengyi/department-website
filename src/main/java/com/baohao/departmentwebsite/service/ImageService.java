package com.baohao.departmentwebsite.service;

import com.baohao.departmentwebsite.dao.ImageGroupInfoMapper;
import com.baohao.departmentwebsite.dao.ImageInfoMapper;
import com.baohao.departmentwebsite.model.ImageGroupInfo;
import com.baohao.departmentwebsite.model.ImageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImageService {
    @Resource
    private ImageInfoMapper imageInfoMapper;

    @Resource
    private ImageGroupInfoMapper imageGroupInfoMapper;

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

    public List<ImageGroupInfo> listImageGroup() {
        List<ImageGroupInfo> imageGroupInfoList = imageGroupInfoMapper.selectByExample(null);
        return imageGroupInfoList;
    }

    public void addImageGroup(ImageGroupInfo add) {
        imageGroupInfoMapper.insertSelective(add);
    }

    public void editImageGroup(ImageGroupInfo edit) {
        imageGroupInfoMapper.updateByPrimaryKeySelective(edit);
    }
}
