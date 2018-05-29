package com.baohao.departmentwebsite.service;

import com.baohao.departmentwebsite.dao.ArticleMapper;
import com.baohao.departmentwebsite.model.Article;
import com.baohao.departmentwebsite.model.ArticleExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    public List<Article> listArticle() {
        ArticleExample example = new ArticleExample();
        example.setOrderByClause("`update_time` DESC, `arti_id` DESC");
        List<Article> articleList = articleMapper.selectByExample(example);
        return articleList;
    }

    public void addArticle(Article add) {
        articleMapper.insertSelective(add);
    }

    public void editArticle(Article edit) {
        articleMapper.updateByPrimaryKeySelective(edit);
    }
}
