package com.fengbang.dashboard.core.test;


import com.fengbang.dashboard.core.util.ReturnUtil;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author:QianHuaSheng
 * @since:2018/1/26
 */
@RestController
public class test {
    @RequestMapping(value = "/test", method = {RequestMethod.POST})
    @Transactional
    @ResponseBody
    public ModelMap hello(Model model) {
        Map map=new HashMap();
        return ReturnUtil.Success("操作成功", null, "/report/home");
    }
}
