package com.fengbang.dashboard.core.controller;
import com.fengbang.dashboard.core.entity.AuthUserRole;
import com.fengbang.dashboard.core.service.AuthUserRoleService;
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
@RequestMapping("/authUserRole")
public class AuthUserRoleController {

    @Autowired
    private AuthUserRoleService authUserRoleService;

    /**
     * @param model
     * @param request
     * @return java.lang.String
     * @throws
     * @Title: authUserRoleMenu
     * @Description: 菜单列表
     * @author code-generator 
     * @date 2018-02-27 17:28:46
     */
    @RequestMapping(value = "/list_authUserRole", method = RequestMethod.GET)
    public String listAuthUserRole(Model model, HttpServletRequest request) {
        List<AuthUserRole> authUserRoles = authUserRoleService.findAll();
        model.addAttribute("authUserRoles", authUserRoles);
        return "/console/authUserRole/index";
    }

    /**
     * @param id
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: forUpdateAuthUserRole
     * @Description: 跳转修改界面
     * @author code-generator 
     * @date 2018-02-27 17:28:46
     */
    @RequestMapping(value = "/for_change_authUserRole/{id}", method = RequestMethod.GET)
    public String forUpdateAuthUserRole(@PathVariable("id") String id, Model model) {
        model.addAttribute("pageType", "update");
        AuthUserRole authUserRole = authUserRoleService.findByPrimaryKey(id);
        model.addAttribute("authUserRole", authUserRole);
        return "/console/authUserRole/from";
    }

    /**
     * @param authUserRole
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: updateAuthUserRole
     * @Description: 保存修改
     * @author code-generator 
     * @date 2018-02-27 17:28:46
     */
    @RequestMapping(value = "/change_authUserRole", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap updateAuthUserRole(AuthUserRole authUserRole, Model model) throws IOException {
//        authUserRole.setUpdateTime(new Date());
        try {
            authUserRoleService.freshByPrimaryKeySelective(authUserRole);
            return ReturnUtil.Success("修改成功", null, "/authUserRole/list_authUserRole");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("修改失败", null, "/authUserRole/for_change_authUserRole/" + authUserRole.getId());
        }
    }

    /**
     * @param id
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: removeAuthUserRole
     * @Description: 删除
     * @author code-generator 
     * @date 2018-02-27 17:28:46
     */
    @RequestMapping(value = "/remove_authUserRole", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap removeAuthUserRole(String id) throws IOException {
        try {
            authUserRoleService.erase(id);
            return ReturnUtil.Success("删除成功", "success", "/authUserRole/list_authUserRole");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("删除失败", "defeated", "/authUserRole/list_authUserRole");
        }
    }

    /**
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: toAddAuthUserRole
     * @Description: 跳转到添加界面
     * @author code-generator 
     * @date 2018-02-27 17:28:46
     */
    @RequestMapping(value = "/to_add_authUserRole", method = RequestMethod.GET)
    public String toAddAuthUserRole(Model model) throws IOException {
        model.addAttribute("authUserRole", new AuthUserRole());
        model.addAttribute("pageType", "add");
        return "/console/authUserRole/from";
    }

    /**
     * @param authUserRole
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: addAuthUserRole
     * @Description: 添加方法
     * @author code-generator 
     * @date 2018-02-27 17:28:46
     */
    @RequestMapping(value = "/add_authUserRole", method = {RequestMethod.POST})
    @ResponseBody
    public ModelMap addAuthUserRole(AuthUserRole authUserRole, Model model) throws IOException {
        authUserRole.setId(null);
        // TODO:  修改人员
//        authUserRole.setCreateTime(new Date());
        try {
            authUserRoleService.persistSelective(authUserRole);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("添加失败", null, "/authUserRole/add_authUserRole");
        }
        return ReturnUtil.Success("添加成功", null, "/authUserRole/list_authUserRole");
    }
}