package com.fengbang.dashboard.core.controller;
import com.fengbang.dashboard.core.entity.Addressbook;
import com.fengbang.dashboard.core.service.AddressbookService;
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
@RequestMapping("/addressbook")
public class AddressbookController {

    @Autowired
    private AddressbookService addressbookService;

    /**
     * @param model
     * @param request
     * @return java.lang.String
     * @throws
     * @Title: addressbookMenu
     * @Description: 菜单列表
     * @author code-generator 
     * @date 2018-02-27 10:58:36
     */
    @RequestMapping(value = "/list_addressbook", method = RequestMethod.GET)
    public String listAddressbook(Model model, HttpServletRequest request) {
        List<Addressbook> addressbooks = addressbookService.findAll();
        model.addAttribute("addressbooks", addressbooks);
        return "/console/addressbook/index";
    }

    /**
     * @param id
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: forUpdateAddressbook
     * @Description: 跳转修改界面
     * @author code-generator 
     * @date 2018-02-27 10:58:36
     */
    @RequestMapping(value = "/for_change_addressbook/{id}", method = RequestMethod.GET)
    public String forUpdateAddressbook(@PathVariable("id") String id, Model model) {
        model.addAttribute("pageType", "update");
        Addressbook addressbook = addressbookService.findByPrimaryKey(id);
        model.addAttribute("addressbook", addressbook);
        return "/console/addressbook/from";
    }

    /**
     * @param addressbook
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: updateAddressbook
     * @Description: 保存修改
     * @author code-generator 
     * @date 2018-02-27 10:58:36
     */
    @RequestMapping(value = "/change_addressbook", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap updateAddressbook(Addressbook addressbook, Model model) throws IOException {
        addressbook.setUpdateTime(new Date());
        try {
            addressbookService.freshByPrimaryKeySelective(addressbook);
            return ReturnUtil.Success("修改成功", null, "/addressbook/list_addressbook");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("修改失败", null, "/addressbook/for_change_addressbook/" + addressbook.getId());
        }
    }

    /**
     * @param id
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: removeAddressbook
     * @Description: 删除
     * @author code-generator 
     * @date 2018-02-27 10:58:36
     */
    @RequestMapping(value = "/remove_addressbook", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap removeAddressbook(String id) throws IOException {
        try {
            addressbookService.erase(id);
            return ReturnUtil.Success("删除成功", "success", "/addressbook/list_addressbook");
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("删除失败", "defeated", "/addressbook/list_addressbook");
        }
    }

    /**
     * @param model
     * @return java.lang.String
     * @throws
     * @Title: toAddAddressbook
     * @Description: 跳转到添加界面
     * @author code-generator 
     * @date 2018-02-27 10:58:36
     */
    @RequestMapping(value = "/to_add_addressbook", method = RequestMethod.GET)
    public String toAddAddressbook(Model model) throws IOException {
        model.addAttribute("addressbook", new Addressbook());
        model.addAttribute("pageType", "add");
        return "/console/addressbook/from";
    }

    /**
     * @param addressbook
     * @param model
     * @return org.springframework.ui.ModelMap
     * @throws
     * @Title: addAddressbook
     * @Description: 添加方法
     * @author code-generator 
     * @date 2018-02-27 10:58:36
     */
    @RequestMapping(value = "/add_addressbook", method = {RequestMethod.POST})
    @ResponseBody
    public ModelMap addAddressbook(Addressbook addressbook, Model model) throws IOException {
        addressbook.setId(null);
        // TODO:  修改人员
        addressbook.setCreateTime(new Date());
        try {
            addressbookService.persistSelective(addressbook);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnUtil.Error("添加失败", null, "/addressbook/add_addressbook");
        }
        return ReturnUtil.Success("添加成功", null, "/addressbook/list_addressbook");
    }
}