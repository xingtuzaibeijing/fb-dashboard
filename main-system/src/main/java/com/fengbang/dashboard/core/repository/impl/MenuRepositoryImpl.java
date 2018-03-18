
package com.fengbang.dashboard.core.repository.impl;

import com.fengbang.dashboard.core.dao.MenuDao;
import com.fengbang.dashboard.core.repository.MenuRepository;
import com.fengbang.dashboard.core.repository.base.AbstractBaseRepository;
import com.fengbang.dashboard.core.entity.Menu;
import com.fengbang.dashboard.core.util.PageQuery;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Menu
 * @author code-generator 
 */
@Component
public class MenuRepositoryImpl extends AbstractBaseRepository<MenuDao, Menu> implements MenuRepository {
	/**
	 * 单个实体添加
	 *@param :Menu
	 *@Return:java.lang.String
	*/
    @Override
    public String insertOne(Menu menu) {
        super.insert(menu);
        return menu.getId();
    }
    
    /**
     *动态添加
     *@param: Menu
     *@Return:java.lang.String
     */
    @Override
    public String  insertOneSelective(Menu menu){
        super.insertSelective(menu);
        return  menu.getId();
    }
    
    /**
     *批量保存
     *@param: List<Menu>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.Menu>
     */
    @Override
    public List<Menu> insertList(List<Menu> menus){
        super.insertListByMapper(menus);
        return menus;
    }

    /**
     *单个修改
     *@param: Menu
     *@Return:void
     */
    @Override
    public void updateByPrimaryKey(Menu menu) {
        super.updateByPrimaryKey(menu);
    }

    /**
     *动态修改
     *@param: Menu
     *@Return:void
     */
    @Override
    public void updateByPrimaryKeySelective(Menu menu) {
        super.updateByPrimaryKeySelective(menu);
    }

    /**
     *根据条件修改
     *@param: Menu,Example
     *@Return:void
     */
    @Override
    public void updateByExample(Menu menu, Example example ) {
        super.updateByExample(menu,example);
    }
    
    /**
     *根据条件动态修改
     *@param: Menu,Example
     *@Return:void
     */
    @Override
    public void updateByExampleSelective(Menu menu, Example example){
        super.updateByExampleSelective(menu,example);
    }
    
    /**
     *根据ID删除
     *@param: String
     *@Return:void
     */
    @Override
    public void delete(String id) {
        super.delete(id);
    }

    /**
     *全部查询
     *@param:void
     *@Return:java.util.List
     */
    @Override
    public List<Menu> selectAll() {
        return  super.selectAll();
    }
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.Menu
     */
    @Override
    public Menu selectByExample(Example example) {
        return  super.selectOneByExample(example);
    }
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.Menu>
     */
    @Override
    public List<Menu> selectByExampleList(Example example) {
        return super.selectListByExample(example);
    }
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.Menu
     */
    @Override
    public Menu selectByPrimaryKey(String id) {
        return super.selectByPrimaryKey(id);
    }

    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    @Override
    public void setPageQuery(PageQuery pageQuery) {
        super.setPageQuery(pageQuery);
    }
}
