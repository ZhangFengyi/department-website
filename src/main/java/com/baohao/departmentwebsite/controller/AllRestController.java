package com.baohao.departmentwebsite.controller;

import com.baohao.departmentwebsite.common.util.EncryptUtils;
import com.baohao.departmentwebsite.controller.request.*;
import com.baohao.departmentwebsite.model.*;
import com.baohao.departmentwebsite.service.ArticleService;
import com.baohao.departmentwebsite.service.ImageService;
import com.baohao.departmentwebsite.service.MenuService;
import com.baohao.departmentwebsite.service.ManagerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class AllRestController {
    @Resource
    private ManagerService managerService;

    @Resource
    private MenuService menuService;

    @Resource
    private ArticleService articleService;

    @Resource
    private ImageService imageService;

    @RequestMapping(value = "/manager/add", method = RequestMethod.POST)
    public ResultHolder userAdd(@RequestBody ManagerAddRequest newManager) {
        try {
            if (!StringUtils.equals(newManager.getPassword(), newManager.getConfirmPassword())) {
                return ResultHolder.error("两次输入密码不一致");
            }
            ManagerInfo existsManager = managerService.findManagerByEmail(newManager.getEmail());
            if (existsManager != null) {
                return ResultHolder.error("邮箱已存在");
            }
            ManagerInfo addManager = new ManagerInfo();
            addManager.setMagEmail(newManager.getEmail());
            addManager.setMagName(newManager.getUsername());
            addManager.setMagPsw(EncryptUtils.md5Encrypt(newManager.getPassword()).toString());
            Date date = new Date();
            date.setTime(System.currentTimeMillis());
            addManager.setCreateTime(date);
            managerService.addManager(addManager);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "manager/list", method = RequestMethod.POST)
    public ResultHolder listManager(@RequestBody ManagerListRequest request) {
        try {
            List<ManagerInfo> managerInfoList = managerService.listManager();
            return ResultHolder.success(managerInfoList);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "manager/edit", method = RequestMethod.POST)
    public ResultHolder editManager(@RequestBody ManagerEditRequest request) {
        try {
            ManagerInfo existsManager = managerService.findManagerByEmail(request.getMagEmail());
            if (existsManager != null) {
                return ResultHolder.error("邮箱已存在");
            }
            ManagerInfo editManager = new ManagerInfo();
            editManager.setMagId(request.getMagId());
            editManager.setMagEmail(request.getMagEmail());
            editManager.setMagName(request.getMagName());
            Date date = new Date();
            date.setTime(System.currentTimeMillis());
            editManager.setUpdateTime(date);
            managerService.editManager(editManager);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "fn/list", method = RequestMethod.POST)
    public ResultHolder listFn(@RequestBody FnListRequest request) {
        try {
            List<FnInfo> fnInfoList = menuService.listFn();
            return ResultHolder.success(fnInfoList);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "fn/add", method = RequestMethod.POST)
    public ResultHolder addFn(@RequestBody FnAddRequest request) {
        try {
            FnInfo add = new FnInfo();
            add.setFnName(request.getFnName());
            add.setFnNumber(request.getFnNumber());
            add.setFnHref(request.getFnHref());
            menuService.addFn(add);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "fn/edit", method = RequestMethod.POST)
    public ResultHolder editFn(@RequestBody FnEditRequest request) {
        try {
            FnInfo edit = new FnInfo();
            edit.setFnId(request.getFnId());
            edit.setFnName(request.getFnName());
            edit.setFnNumber(request.getFnNumber());
            edit.setFnHref(request.getFnHref());
            menuService.editFn(edit);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "sn/list", method = RequestMethod.POST)
    public ResultHolder listSn(@RequestBody SnListRequest request) {
        try {
            List<SnInfo> snInfoList = menuService.listSn();
            return ResultHolder.success(snInfoList);
        } catch (Exception e){
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "sn/add", method = RequestMethod.POST)
    public ResultHolder addSn(@RequestBody SnAddRequest request) {
        try {
            SnInfo add = new SnInfo();
            add.setSnName(request.getSnName());
            add.setSnNumber(request.getSnNumber());
            add.setSnDoc(request.getSnDoc());
            add.setFnId(request.getFnId());
            menuService.addSn(add);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "sn/edit", method = RequestMethod.POST)
    public ResultHolder editSn(@RequestBody SnEditRequest request) {
        try {
            SnInfo edit = new SnInfo();
            edit.setSnId(request.getSnId());
            edit.setSnName(request.getSnName());
            edit.setSnNumber(request.getSnNumber());
            edit.setSnDoc(request.getSnDoc());
            edit.setFnId(request.getFnId());
            menuService.editSn(edit);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "article/list", method = RequestMethod.POST)
    public ResultHolder listArticle(@RequestBody ArticleListRequest request) {
        try {
            List<Article> articleList = articleService.listArticle();
            return ResultHolder.success(articleList);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "article/add", method = RequestMethod.POST)
    public ResultHolder addArticle(@RequestBody ArticleAddRequest request) {
        try {
            Article add = new Article();
            add.setArtiName(request.getArtiName());
            add.setArtiAuthor(request.getArtiAuthor());
            Date date = new Date();
            date.setTime(System.currentTimeMillis());
            add.setCreateTime(date);
            articleService.addArticle(add);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "article/edit", method = RequestMethod.POST)
    public ResultHolder editArticle(@RequestBody ArticleEditRequest request) {
        try {
            Article edit = new Article();
            edit.setArtiId(request.getArtiId());
            edit.setArtiName(request.getArtiName());
            edit.setArtiAuthor(request.getArtiAuthor());
            Date date = new Date();
            date.setTime(System.currentTimeMillis());
            edit.setUpdateTime(date);
            articleService.editArticle(edit);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "articleList/list", method = RequestMethod.POST)
    public ResultHolder listArticleList(@RequestBody ArticleListListRequest request) {
        try {
            List<ArticleList> articleListList = articleService.listArticleList();
            return ResultHolder.success(articleListList);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "articleList/add", method = RequestMethod.POST)
    public ResultHolder addArticleList(@RequestBody ArticleListAddRequest request) {
        try {
            ArticleList add = new ArticleList();
            add.setArlName(request.getArlName());
            Date date = new Date();
            date.setTime(System.currentTimeMillis());
            add.setCreateTime(date);
            articleService.addArticleList(add);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "articleList/edit", method = RequestMethod.POST)
    public ResultHolder editArticleList(@RequestBody ArticleListEditRequest request) {
        try {
            ArticleList edit = new ArticleList();
            edit.setArlId(request.getArlId());
            edit.setArlName(request.getArlName());
            Date date = new Date();
            date.setTime(System.currentTimeMillis());
            edit.setUpdateTime(date);
            articleService.editArticleList(edit);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "image/list", method = RequestMethod.POST)
    public ResultHolder listImage(@RequestBody ImageListRequest request) {
        try {
            List<ImageInfo> imageInfoList = imageService.listImage();
            return ResultHolder.success(imageInfoList);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "image/add", method = RequestMethod.POST)
    public ResultHolder addImage(@RequestBody ImageAddRequest request) {
        try {
            ImageInfo add = new ImageInfo();
            add.setImgName(request.getImgName());
            add.setImgPath(request.getImgPath());
            add.setImgGroupId(request.getImgGroupId());
            Date date = new Date();
            date.setTime(System.currentTimeMillis());
            add.setCreateTime(date);
            imageService.addImage(add);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "image/edit", method = RequestMethod.POST)
    public ResultHolder editImage(@RequestBody ImageEditRequest request) {
        try {
            ImageInfo edit = new ImageInfo();
            edit.setImgId(request.getImgId());
            edit.setImgName(request.getImgName());
            edit.setImgPath(request.getImgPath());
            edit.setImgGroupId(request.getImgGroupId());
            imageService.editImage(edit);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "image/group/list", method = RequestMethod.POST)
    public ResultHolder listImageGroup(@RequestBody ImageGroupListRequest request) {
        try {
            List<ImageGroupInfo> imageGroupInfoList = imageService.listImageGroup();
            return ResultHolder.success(imageGroupInfoList);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "image/group/add", method = RequestMethod.POST)
    public ResultHolder addImageGroup(@RequestBody ImageGroupAddRequest request) {
        try {
            ImageGroupInfo add = new ImageGroupInfo();
            add.setGroupName(request.getGroupName());
            Date date = new Date();
            date.setTime(System.currentTimeMillis());
            add.setCreateTime(date);
            imageService.addImageGroup(add);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }

    @RequestMapping(value = "image/group/edit", method = RequestMethod.POST)
    public ResultHolder editImageGroup(@RequestBody ImageGroupEditRequest request) {
        try {
            ImageGroupInfo edit = new ImageGroupInfo();
            edit.setGroupId(request.getGroupId());
            edit.setGroupName(request.getGroupName());
            Date date = new Date();
            date.setTime(System.currentTimeMillis());
            imageService.editImageGroup(edit);
            return ResultHolder.success(null);
        } catch (Exception e) {
            return ResultHolder.error(e.getMessage());
        }
    }
}
