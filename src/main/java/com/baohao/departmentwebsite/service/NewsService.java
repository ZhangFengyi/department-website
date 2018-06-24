package com.baohao.departmentwebsite.service;

import com.baohao.departmentwebsite.dao.NewsMapper;
import com.baohao.departmentwebsite.model.News;
import com.baohao.departmentwebsite.model.NewsExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NewsService {
    @Resource
    private NewsMapper newsMapper;

    public List<News> listNews() {
        NewsExample example = new NewsExample();
        List<News> newsList = newsMapper.selectByExample(example);
        return newsList;
    }
}
