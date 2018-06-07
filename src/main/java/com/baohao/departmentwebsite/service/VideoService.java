package com.baohao.departmentwebsite.service;

import com.baohao.departmentwebsite.dao.VideoGroupInfoMapper;
import com.baohao.departmentwebsite.dao.VideoInfoMapper;
import com.baohao.departmentwebsite.model.VideoGroupInfo;
import com.baohao.departmentwebsite.model.VideoInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VideoService {
    @Resource
    private VideoInfoMapper videoInfoMapper;

    @Resource
    private VideoGroupInfoMapper videoGroupInfoMapper;

    public List<VideoInfo> listVideo() {
        return videoInfoMapper.selectByExample(null);
    }

    public void addVideo(VideoInfo add) {
        videoInfoMapper.insertSelective(add);
    }

    public void editVideo(VideoInfo edit) {
        videoInfoMapper.updateByPrimaryKeySelective(edit);
    }

    public List<VideoGroupInfo> listVideoGroup() {
        return videoGroupInfoMapper.selectByExample(null);
    }

    public void addVideoGroup(VideoGroupInfo add) {
        videoGroupInfoMapper.insertSelective(add);
    }

    public void editVideoGroup(VideoGroupInfo edit) {
        videoGroupInfoMapper.updateByPrimaryKeySelective(edit);
    }
}
