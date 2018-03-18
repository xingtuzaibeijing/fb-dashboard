package com.fengbang.dashboard.core.controller;


import com.fengbang.dashboard.core.entity.AuthResource;
import com.fengbang.dashboard.core.entity.Menu;
import com.fengbang.dashboard.core.service.AuthResourceService;
import com.fengbang.dashboard.core.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by QianHuaSheng on 2017/3/7.
 */
@Controller
@RequestMapping("/report")
public class HomeController {
    @Autowired
    private MenuService menuService;

    @Autowired
    private AuthResourceService authResourceService;

    /**
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: hello
     * @Description:首页
     * @author QianHuaSheng
     * @date 2018/02/13 04:21:10
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String hello(Model model) {
        Map map = new HashMap();
        map.put("menuType", "fatherNode");
        Example example = getExample(Menu.class, map, "'menuRank' asc");
        List<Menu> menus = menuService.findByExampleList(example);
        model.addAttribute("menus", menus);
        return "/console/index";
    }

    @RequestMapping(value = "/summary", method = RequestMethod.GET)
    public String summary(Model model) {
        model.addAttribute("");
        return "/console/right";
    }

    @RequestMapping(value = "/mass_texting", method = RequestMethod.GET)
    public String massTexting(Model model) {
        model.addAttribute("");
        return "a";
    }
    /**
     * @param menu
     * @return java.util.List<com.fengbang.dashboard.core.entity.Menu>
     * @throws
     * @Title: getMenus
     * @Description: 右边菜单联动
     * @author QianHuaSheng
     * @date 2018/02/13 04:21:44
     */
    @RequestMapping(value = "/get_menus", method = RequestMethod.POST)
    @ResponseBody
    public List<Menu> getMenus(Menu menu) {
        Map map = new HashMap();
        map.put("menuSuperior", (menu.getId() == null ? "" : menu.getId()));
        Example example = getExample(Menu.class, map, "'menuRank' asc");
        List<Menu> menus = menuService.findByExampleList(example);
        return menus;
    }

    /**
     * @param menu
     * @return java.util.List<com.fengbang.dashboard.core.entity.Menu>
     * @throws
     * @Title: generateFunction
     * @Description: 生成功能一套
     * @author QianHuaSheng
     * @date 2018/02/13 04:22:15
     */
    @RequestMapping(value = "/generate_function", method = RequestMethod.POST)
    @ResponseBody
    public List<Menu> generateFunction(Menu menu) {
        Map map = new HashMap();
        map.put("menuSuperior", (menu.getId() == null ? "" : menu.getId()));
        Example example = getExample(Menu.class, map, "'menuRank' asc");
        List<Menu> menus = menuService.findByExampleList(example);
        return menus;
    }

    //得到exmple
    private Example getExample(Class cla, Map<String, String> map, String order) {
        Example example = new Example(cla);
        Example.Criteria criteria = example.createCriteria();
        if (map != null) {
            for (String key : map.keySet()) {
                String s = map.get(key);
                criteria.andEqualTo(key, s);
            }
        }
        if (order != null && !"".equals(order)) {
            example.setOrderByClause(order);
        }
        return example;
    }


}