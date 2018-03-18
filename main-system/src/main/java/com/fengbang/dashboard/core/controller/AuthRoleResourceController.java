package com.fengbang.dashboard.core.controller;
import com.fengbang.dashboard.core.entity.AuthRoleResource;
import com.fengbang.dashboard.core.service.AuthRoleResourceService;
import com.fengbang.dashboard.core.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.*;

/**
 * Created by code-generator  on 2017/3/7.
 */
@Controller
@RequestMapping("/authRoleResource")
public class AuthRoleResourceController {

    @Autowired
    private AuthRoleResourceService authRoleResourceService;

    /**
     * @param model
     * @param request
     * @return java.lang.String
     * @throws
     * @Title: authRoleResourceMenu
     * @Description: 菜单列表
     * @author code-generator 
     * @date 2018-02-27 17:36:44
     */
    @RequestMapping(value = "/list_authRoleResource", method = RequestMethod.GET)
    public String listAuthRoleResource(Model model, HttpServletRequest request) {
        List<AuthRoleResource> authRoleResources = authRoleResourceService.findAll();
        model.addAttribute("authRoleResources", authRoleResources);
        return "/console/authRoleResource/index";
    }

    /**
     * @param id
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: forUpdateAuthRoleResource
     * @Description: 跳转修改界面
     * @author code-generator 
     * @date 2018-02-27 17:36:44
     */
    @RequestMapping(value = "/for_change_authRoleResource/{id}", method = RequestMethod.GET)
    public String forUpdateAuthRoleResource(@PathVariable("id") String id, Model model) {
        model.addAttribute("pageType", "update");
        AuthRoleResource authRoleResource = authRoleResourceService.findByPrimaryKey(id);
        model.addAttribute("authRoleResource", authRoleResource);
        return "/console/authRoleResource/from";
    }

    /**
     * @param authRoleResource
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: updateAuthRoleResource
     * @Description: 保存修改
     * @author code-generator 
     * @date 2018-02-27 17:36:44
     */
    @RequestMapping(value = "/change_authRoleResource", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap updateAuthRoleResource(AuthRoleResource authRoleResource, Model model) throws IOException {
//        authRoleResource.setUpdateTime(new Date());
        try {
            authRoleResourceService.freshByPrimaryKeySelective(authRoleResource);
            return ReturnUtil.Success("修改成功", null, "/authRoleResource/list_authRoleResource");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("修改失败", null, "/authRoleResource/for_change_authRoleResource/" + authRoleResource.getId());
        }
    }

    /**
     * @param id
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: removeAuthRoleResource
     * @Description: 删除
     * @author code-generator 
     * @date 2018-02-27 17:36:44
     */
    @RequestMapping(value = "/remove_authRoleResource", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap removeAuthRoleResource(String id) throws IOException {
        try {
            authRoleResourceService.erase(id);
            return ReturnUtil.Success("删除成功", "success", "/authRoleResource/list_authRoleResource");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("删除失败", "defeated", "/authRoleResource/list_authRoleResource");
        }
    }

    /**
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: toAddAuthRoleResource
     * @Description: 跳转到添加界面
     * @author code-generator 
     * @date 2018-02-27 17:36:44
     */
    @RequestMapping(value = "/to_add_authRoleResource", method = RequestMethod.GET)
    public String toAddAuthRoleResource(Model model) throws IOException {
        model.addAttribute("authRoleResource", new AuthRoleResource());
        model.addAttribute("pageType", "add");
        return "/console/authRoleResource/from";
    }

    /**
     * @param authRoleResource
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: addAuthRoleResource
     * @Description: 添加方法
     * @author code-generator 
     * @date 2018-02-27 17:36:44
     */
    @RequestMapping(value = "/add_authRoleResource", method = {RequestMethod.POST})
    @ResponseBody
    public ModelMap addAuthRoleResource(AuthRoleResource authRoleResource, Model model) throws IOException {
        authRoleResource.setId(null);
        // TODO:  修改人员
//        authRoleResource.setCreateTime(new Date());
        try {
            authRoleResourceService.persistSelective(authRoleResource);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("添加失败", null, "/authRoleResource/add_authRoleResource");
        }
        return ReturnUtil.Success("添加成功", null, "/authRoleResource/list_authRoleResource");
    }
}