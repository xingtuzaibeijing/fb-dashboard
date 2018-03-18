<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign tableNameNew = table.tableNameNew>
<#assign tableNameNewLowerCase = table.tableNameNewLowerCase>
<#assign date = table.nowDate>
package ${basepackage}.controller;
import ${basepackage}.entity.${tableNameNew};
import ${basepackage}.service.${tableNameNew}Service;
import ${basepackage}.util.ReturnUtil;
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
@RequestMapping("/${tableNameNewLowerCase}")
public class ${tableNameNew}Controller {

    @Autowired
    private ${tableNameNew}Service ${tableNameNewLowerCase}Service;

    /**
     * @param model
     * @param request
     * @return java.lang.String
     * @throws
     * @Title: ${tableNameNewLowerCase}Menu
     * @Description: 菜单列表
     * @author code-generator 
     * @date ${date}
     */
    @RequestMapping(value = "/list_${tableNameNewLowerCase}", method = RequestMethod.GET)
    public String list${tableNameNew}(Model model, HttpServletRequest request) {
        List<${tableNameNew}> ${tableNameNewLowerCase}s = ${tableNameNewLowerCase}Service.findAll();
        model.addAttribute("${tableNameNewLowerCase}s", ${tableNameNewLowerCase}s);
        return "/console/${tableNameNewLowerCase}/index";
    }

    /**
     * @param id
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: forUpdate${tableNameNew}
     * @Description: 跳转修改界面
     * @author code-generator 
     * @date ${date}
     */
    @RequestMapping(value = "/for_change_${tableNameNewLowerCase}/{id}", method = RequestMethod.GET)
    public String forUpdate${tableNameNew}(@PathVariable("id") String id, Model model) {
        model.addAttribute("pageType", "update");
        ${tableNameNew} ${tableNameNewLowerCase} = ${tableNameNewLowerCase}Service.findByPrimaryKey(id);
        model.addAttribute("${tableNameNewLowerCase}", ${tableNameNewLowerCase});
        return "/console/${tableNameNewLowerCase}/from";
    }

    /**
     * @param ${tableNameNewLowerCase}
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: update${tableNameNew}
     * @Description: 保存修改
     * @author code-generator 
     * @date ${date}
     */
    @RequestMapping(value = "/change_${tableNameNewLowerCase}", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap update${tableNameNew}(${tableNameNew} ${tableNameNewLowerCase}, Model model) throws IOException {
        ${tableNameNewLowerCase}.setUpdateTime(new Date());
        try {
            ${tableNameNewLowerCase}Service.freshByPrimaryKeySelective(${tableNameNewLowerCase});
            return ReturnUtil.Success("修改成功", null, "/${tableNameNewLowerCase}/list_${tableNameNewLowerCase}");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("修改失败", null, "/${tableNameNewLowerCase}/for_change_${tableNameNewLowerCase}/" + ${tableNameNewLowerCase}.getId());
        }
    }

    /**
     * @param id
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: remove${tableNameNew}
     * @Description: 删除
     * @author code-generator 
     * @date ${date}
     */
    @RequestMapping(value = "/remove_${tableNameNewLowerCase}", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap remove${tableNameNew}(String id) throws IOException {
        try {
            ${tableNameNewLowerCase}Service.erase(id);
            return ReturnUtil.Success("删除成功", "success", "/${tableNameNewLowerCase}/list_${tableNameNewLowerCase}");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("删除失败", "defeated", "/${tableNameNewLowerCase}/list_${tableNameNewLowerCase}");
        }
    }

    /**
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: toAdd${tableNameNew}
     * @Description: 跳转到添加界面
     * @author code-generator 
     * @date ${date}
     */
    @RequestMapping(value = "/to_add_${tableNameNewLowerCase}", method = RequestMethod.GET)
    public String toAdd${tableNameNew}(Model model) throws IOException {
        model.addAttribute("${tableNameNewLowerCase}", new ${tableNameNew}());
        model.addAttribute("pageType", "add");
        return "/console/${tableNameNewLowerCase}/from";
    }

    /**
     * @param ${tableNameNewLowerCase}
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: add${tableNameNew}
     * @Description: 添加方法
     * @author code-generator 
     * @date ${date}
     */
    @RequestMapping(value = "/add_${tableNameNewLowerCase}", method = {RequestMethod.POST})
    @ResponseBody
    public ModelMap add${tableNameNew}(${tableNameNew} ${tableNameNewLowerCase}, Model model) throws IOException {
        ${tableNameNewLowerCase}.setId(null);
        // TODO:  修改人员
        ${tableNameNewLowerCase}.setCreateTime(new Date());
        try {
            ${tableNameNewLowerCase}Service.persistSelective(${tableNameNewLowerCase});
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("添加失败", null, "/${tableNameNewLowerCase}/add_${tableNameNewLowerCase}");
        }
        return ReturnUtil.Success("添加成功", null, "/${tableNameNewLowerCase}/list_${tableNameNewLowerCase}");
    }
}