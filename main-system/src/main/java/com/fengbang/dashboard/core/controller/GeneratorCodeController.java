package com.fengbang.dashboard.core.controller;

import com.fengbang.dashboard.core.entity.Menu;
import com.fengbang.dashboard.core.entity.vo.GeneratorVO;
import com.fengbang.dashboard.core.service.AuthResourceService;
import com.fengbang.dashboard.core.service.MenuService;
import com.fengbang.dashboard.core.util.ExampleUtil;
import com.fengbang.genrate.app.CodeGenFBFrameworkOracle;
import com.fengbang.genrate.code.util.TFMakeName;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by QianHuaSheng on 2017/3/7.
 */
@Controller
@RequestMapping("/generator")
public class GeneratorCodeController {
    @Autowired
    private MenuService menuService;

    @Autowired
    private AuthResourceService authResourceService;

    @RequestMapping(value = "/to_generate", method = RequestMethod.GET)
    public String toGenerate(Model model) {
        //得到菜单
        Map map = new HashMap();
        map.put("menuType", "fatherNode");
        Example example = ExampleUtil.getExample(Menu.class, map, "'menuRank' asc");
        List<Menu> menus = menuService.findByExampleList(example);
        model.addAttribute("menus", menus);
        return "/console/generator/generate_function";
    }

    /**
     * @return java.lang.String
     * @throws
     * @Title: generatorCode
     * @Description: 生成代码
     * @author QianHuaSheng
     * @date 2018/02/13 04:24:52
     */
    @RequestMapping(value = "/generator_code", method = RequestMethod.POST)
    public String generatorCode(GeneratorVO generatorVO) throws Exception {
        //往菜单表中插入新添加的功能
        Menu menu = new Menu();
        // TODO: 2018/2/13 选择菜单名称  上级菜单名称 菜单类型 排序
        BeanUtils.copyProperties(generatorVO,menu);
        menu.setMenuType("node");
        String tableName = generatorVO.getTableName();
        //是否以T_开头
        if (tableName.startsWith("T_")||tableName.startsWith("t_")){
            tableName= tableName.substring(2,tableName.length());
        }
        //转驼峰
        tableName = TFMakeName.lineToHump(tableName);
        //首字母转小写
        tableName = TFMakeName.tofristlower(tableName);
        menu.setMenuResource("/"+tableName+"/list_"+tableName);
        menuService.persistSelective(menu);
        try {
            CodeGenFBFrameworkOracle.run("D:\\xiangmu\\FBZL\\fb-dashboard", generatorVO.getTableName(), generatorVO.getType(),generatorVO.getDateBase());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/console/generator/generate_function";
    }
}