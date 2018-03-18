package com.fengbang.dashboard.core.service;

import com.fengbang.dashboard.core.entity.Menu;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * Menu
 * @author code-generator 
 */
public interface MenuService {

    /**
     * @param menu
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
  */
    String  persistSelective(Menu menu);

    /**
     * @param menu
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    void freshByPrimaryKey(Menu menu);
   
    /**
     * @param menu
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    void freshByPrimaryKeySelective(Menu menu);
    

    /**
     * @param menu
     * @param example
     * @return void
     * @throws
     * @Title: freshByExampleSelective
     * @Description: 根据条件动态修改
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    void freshByExampleSelective(Menu menu, Example example);
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    void erase(String id);
    
    /**
     * @return List<Menu>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    List<Menu> findAll();
    
    
    /**
     * @param example
     * @return List<Menu>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    List<Menu> findByExampleList(Example example);
    
    /**
     * @param example
     * @return Menu
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    Menu findByExample(Example example);
    
    /**
     * @param  id
     * @return Menu
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    Menu findByPrimaryKey(String id);
    
  
}
