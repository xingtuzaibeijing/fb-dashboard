package com.fengbang.dashboard.core.service.impl;

import com.fengbang.dashboard.core.repository.MenuRepository;
import com.fengbang.dashboard.core.service.MenuService;
import com.fengbang.dashboard.core.entity.Menu;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Menu
 * @author QianHuaSheng
 */
@Component
public class MenuServiceImpl implements MenuService{
	 @Autowired
	 public  MenuRepository menuRepository;
	
    /**
     * @param menu
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
  */
    @Override
    public String  persistSelective(Menu menu){
    	String menuId=menuRepository.insertOneSelective(menu);
        return  menuId;
    }
    
    /**
     * @param menu
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    @Override
    public void freshByPrimaryKey(Menu menu) {
    	menuRepository.updateByPrimaryKey(menu);
    }

    /**
     * @param menu
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    @Override
    public void freshByPrimaryKeySelective(Menu menu) {
    	menuRepository.updateByPrimaryKeySelective(menu);
    }
   
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
    @Override
    public void freshByExampleSelective(Menu menu, Example example){
    	menuRepository.updateByExampleSelective(menu,example);
    }
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    @Override
    public void erase(String id) {
    	menuRepository.delete(id);
    }

    /**
     * @return List<Menu>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    @Override
    public List<Menu> findAll() {
        return  menuRepository.selectAll();
    }
    
    /**
     * @param example
     * @return List<Menu>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    @Override
    public List<Menu> findByExampleList(Example example) {
        return menuRepository.selectByExampleList(example);
    }
    /**
     * @param example
     * @return Menu
     * @throws
     * @Title: findByExample
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    @Override
    public Menu findByExample(Example example) {
    	List<Menu>  menus=menuRepository.selectByExampleList(example);
    	 if (menus != null && menus.size() > 0) {
    		 return menus.get(0);
    	 }else {
    		 return null;
    	 }
    }
    /**
     * @param  id
     * @return Menu
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-16 10:52:41
     */
    @Override
    public Menu findByPrimaryKey(String id) {
        return menuRepository.selectByPrimaryKey(id);
    }
}
