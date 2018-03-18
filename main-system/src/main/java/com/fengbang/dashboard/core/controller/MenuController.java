package com.fengbang.dashboard.core.controller;
import com.fengbang.dashboard.core.entity.Menu;
import com.fengbang.dashboard.core.service.MenuService;
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
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    /**
     * @param model
     * @param request
     * @return java.lang.String
     * @throws
     * @Title: menuMenu
     * @Description: 菜单列表
     * @author code-generator 
     * @date 2018-02-20 14:36:00
     */
    @RequestMapping(value = "/list_menu", method = RequestMethod.GET)
    public String listMenu(Model model, HttpServletRequest request) {
        List<Menu> menus = menuService.findAll();
        model.addAttribute("menus", menus);
        return "/console/menu/index";
    }

    /**
     * @param id
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: forUpdateMenu
     * @Description: 跳转修改界面
     * @author code-generator 
     * @date 2018-02-20 14:36:00
     */
    @RequestMapping(value = "/for_change_menu/{id}", method = RequestMethod.GET)
    public String forUpdateMenu(@PathVariable("id") String id, Model model) {
        model.addAttribute("pageType", "update");
        Menu menu = menuService.findByPrimaryKey(id);
        model.addAttribute("menu", menu);
        return "/console/menu/from";
    }

    /**
     * @param menu
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: updateMenu
     * @Description: 保存修改
     * @author code-generator 
     * @date 2018-02-20 14:36:00
     */
    @RequestMapping(value = "/change_menu", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap updateMenu(Menu menu, Model model) throws IOException {
//        menu.setUpdateTime(new Date());
        try {
            menuService.freshByPrimaryKeySelective(menu);
            return ReturnUtil.Success("修改成功", null, "/menu/list_menu");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("修改失败", null, "/menu/for_change_menu/" + menu.getId());
        }
    }

    /**
     * @param id
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: removeMenu
     * @Description: 删除
     * @author code-generator 
     * @date 2018-02-20 14:36:00
     */
    @RequestMapping(value = "/remove_menu", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap removeMenu(String id) throws IOException {
        try {
            menuService.erase(id);
            return ReturnUtil.Success("删除成功", "success", "/menu/list_menu");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("删除失败", "defeated", "/menu/list_menu");
        }
    }

    /**
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: toAddMenu
     * @Description: 跳转到添加界面
     * @author code-generator 
     * @date 2018-02-20 14:36:00
     */
    @RequestMapping(value = "/to_add_menu", method = RequestMethod.GET)
    public String toAddMenu(Model model) throws IOException {
        model.addAttribute("menu", new Menu());
        model.addAttribute("pageType", "add");
        return "/console/menu/from";
    }

    /**
     * @param menu
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: addMenu
     * @Description: 添加方法
     * @author code-generator 
     * @date 2018-02-20 14:36:00
     */
    @RequestMapping(value = "/add_menu", method = {RequestMethod.POST})
    @ResponseBody
    public ModelMap addMenu(Menu menu, Model model) throws IOException {
        menu.setId(null);
        // TODO:  修改人员
//        menu.setCreateTime(new Date());
        try {
            menuService.persistSelective(menu);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("添加失败", null, "/menu/add_menu");
        }
        return ReturnUtil.Success("添加成功", null, "/menu/list_menu");
    }
}