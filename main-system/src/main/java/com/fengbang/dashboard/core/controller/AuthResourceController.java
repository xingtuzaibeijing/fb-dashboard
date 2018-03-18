package com.fengbang.dashboard.core.controller;

import com.fengbang.dashboard.core.entity.AuthResource;
import com.fengbang.dashboard.core.service.AuthResourceService;
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
 * Created by generate on 2017/3/7.
 */
@Controller
@RequestMapping("/resource")
public class AuthResourceController {

    @Autowired
    private AuthResourceService authResourceService;

    /**
     * @param model
     * @param request
     * @return java.lang.String
     * @throws
     * @Title: resourceMenu
     * @Description: 菜单列表
     * @author generate
     * @date 2018/02/13 03:37:17
     */
    @RequestMapping(value = "/list_auth_resourcre", method = RequestMethod.GET)
    public String resourceMenu(Model model, HttpServletRequest request) {
        List<AuthResource> authResources = authResourceService.findAll();
        model.addAttribute("authResources", authResources);
        return "/console/resource/index";
    }

    /**
     * @param id
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: forUpdateMemu
     * @Description: 跳转修改界面
     * @author generate
     * @date 2018/02/13 03:20:31
     */
    @RequestMapping(value = "/for_change_resource/{id}", method = RequestMethod.GET)
    public String forUpdateMemu(@PathVariable("id") String id, Model model) {
        model.addAttribute("pageType", "update");
        AuthResource authResource = authResourceService.findByPrimaryKey(id);
        model.addAttribute("authResource", authResource);
        return "/console/resource/from";
    }

    /**
     * @param authResource
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: updateResource
     * @Description: 保存修改
     * @author generate
     * @date 2018/02/13 03:24:06
     */
    @RequestMapping(value = "/change_resource", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap updateResource(AuthResource authResource, Model model) throws IOException {
        authResource.setUpdateTime(new Date());
        try {
            authResourceService.freshByPrimaryKeySelective(authResource);
            return ReturnUtil.Success("修改成功", null, "/resource/list_auth_resourcre");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("修改失败", null, "/resource/for_change_resource/" + authResource.getId());
        }
    }

    /**
     * @param id
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: removeMemu
     * @Description: 删除
     * @author generate
     * @date 2018/02/13 03:24:56
     */
    @RequestMapping(value = "/remove_resource", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap removeMemu(String id) throws IOException {
        try {
            authResourceService.erase(id);
            return ReturnUtil.Success("删除成功", "success", "/resource/list_auth_resourcre");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("删除失败", "defeated", "/resource/list_auth_resourcre");
        }
    }

    /**
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: toAddMemu
     * @Description: 跳转到添加界面
     * @author generate
     * @date 2018/02/13 03:25:26
     */
    @RequestMapping(value = "/to_add_auth_resourcre", method = RequestMethod.GET)
    public String toAddMemu(Model model) throws IOException {
        model.addAttribute("authResource", new AuthResource());
        model.addAttribute("pageType", "add");
        return "/console/resource/from";
    }

    /**
     * @param authResource
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: addMemu
     * @Description: 添加方法
     * @author generate
     * @date 2018/02/13 03:26:09
     */
    @RequestMapping(value = "/add_auth_resourcre", method = {RequestMethod.POST})
    @ResponseBody
    public ModelMap addMemu(AuthResource authResource, Model model) throws IOException {
        authResource.setId(null);
        // TODO:  修改人员
        authResource.setCreateTime(new Date());
        try {
            authResourceService.persistSelective(authResource);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("添加失败", null, "/resource/add_auth_resourcre");
        }
        return ReturnUtil.Success("添加成功", null, "/resource/list_auth_resourcre");
    }
}