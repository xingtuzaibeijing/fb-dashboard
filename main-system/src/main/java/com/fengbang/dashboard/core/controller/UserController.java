package com.fengbang.dashboard.core.controller;
import com.fengbang.dashboard.core.entity.User;
import com.fengbang.dashboard.core.service.UserService;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @param model
     * @param request
     * @return java.lang.String
     * @throws
     * @Title: userMenu
     * @Description: 菜单列表
     * @author code-generator 
     * @date 2018-02-20 12:15:30
     */
    @RequestMapping(value = "/list_user", method = RequestMethod.GET)
    public String listUser(Model model, HttpServletRequest request) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "/console/user/index";
    }

    /**
     * @param id
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: forUpdateUser
     * @Description: 跳转修改界面
     * @author code-generator 
     * @date 2018-02-20 12:15:30
     */
    @RequestMapping(value = "/for_change_user/{id}", method = RequestMethod.GET)
    public String forUpdateUser(@PathVariable("id") String id, Model model) {
        model.addAttribute("pageType", "update");
        User user = userService.findByPrimaryKey(id);
        model.addAttribute("user", user);
        return "/console/user/from";
    }

    /**
     * @param user
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: updateUser
     * @Description: 保存修改
     * @author code-generator 
     * @date 2018-02-20 12:15:30
     */
    @RequestMapping(value = "/change_user", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap updateUser(User user, Model model) throws IOException {
//        user.setUpdateTime(new Date());
        try {
            userService.freshByPrimaryKeySelective(user);
            return ReturnUtil.Success("修改成功", null, "/user/list_user");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("修改失败", null, "/user/for_change_user/" + user.getId());
        }
    }

    /**
     * @param id
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: removeUser
     * @Description: 删除
     * @author code-generator 
     * @date 2018-02-20 12:15:30
     */
    @RequestMapping(value = "/remove_user", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap removeUser(String id) throws IOException {
        try {
            userService.erase(id);
            return ReturnUtil.Success("删除成功", "success", "/user/list_user");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("删除失败", "defeated", "/user/list_user");
        }
    }

    /**
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: toAddUser
     * @Description: 跳转到添加界面
     * @author code-generator 
     * @date 2018-02-20 12:15:30
     */
    @RequestMapping(value = "/to_add_user", method = RequestMethod.GET)
    public String toAddUser(Model model) throws IOException {
        model.addAttribute("user", new User());
        model.addAttribute("pageType", "add");
        return "/console/user/from";
    }

    /**
     * @param user
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: addUser
     * @Description: 添加方法
     * @author code-generator 
     * @date 2018-02-20 12:15:30
     */
    @RequestMapping(value = "/add_user", method = {RequestMethod.POST})
    @ResponseBody
    public ModelMap addUser(User user, Model model) throws IOException {
        user.setId(null);
        // TODO:  修改人员
//        user.setCreateTime(new Date());
        try {
            userService.persistSelective(user);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("添加失败", null, "/user/add_user");
        }
        return ReturnUtil.Success("添加成功", null, "/user/list_user");
    }
}