package com.baohao.departmentwebsite.service;

import com.baohao.departmentwebsite.dao.ArticleListMapper;
import com.baohao.departmentwebsite.dao.ArticleMapper;
import com.baohao.departmentwebsite.model.Article;
import com.baohao.departmentwebsite.model.ArticleExample;
import com.baohao.departmentwebsite.model.ArticleList;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Resource
    private ArticleListMapper articleListMapper;

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

    public List<ArticleList> listArticleList() {
        List<ArticleList> articleListList = articleListMapper.selectByExample(null);
        return articleListList;
    }

    public void addArticleList(ArticleList add) {
        articleListMapper.insertSelective(add);
    }

    public void editArticleList(ArticleList edit) {
        articleListMapper.updateByPrimaryKeySelective(edit);
    }
}
