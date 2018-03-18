package com.fengbang.dashboard.core.repository;

import com.fengbang.dashboard.core.entity.Menu;
import com.fengbang.dashboard.core.util.PageQuery;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * Menu
 * @author code-generator 
 */
public interface MenuRepository {
	/**
	 * 单个实体添加
	 *@param :Menu
	 *@Return:java.lang.String
	*/
    String insertOne(Menu menu);

    /**
     *动态添加
     *@param: Menu
     *@Return:java.lang.String
     */
    String  insertOneSelective(Menu menu);
    
    /**
     *批量保存
     *@param: List<Menu>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.Menu>
     */
    List<Menu> insertList(List<Menu> menus);
    
    /**
     *单个修改
     *@param: Menu
     *@Return:void
     */
    void updateByPrimaryKey(Menu menu);
   
    /**
     *动态修改
     *@param: Menu
     *@Return:void
     */
    void updateByPrimaryKeySelective(Menu menu);
    
    /**
     *根据条件修改
     *@param: Menu,Example
     *@Return:void
     */
    void updateByExample(Menu menu, Example example);

    /**
     *根据条件动态修改
     *@param: Menu,Example
     *@Return:void
     */
    void updateByExampleSelective(Menu menu, Example example);
    
    /**
     *根据ID删除
     *@param: String
     *@Return:void
     */
    void delete(String id);
    
    /**
     *全部查询
     *@param:void
     *@Return:java.util.List
     */
    List<Menu> selectAll();
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.Menu
     */
    Menu selectByExample(Example example);
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.Menu>
     */
    List<Menu> selectByExampleList(Example example);
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.Menu
     */
    Menu selectByPrimaryKey(String id);
        
    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    void setPageQuery(PageQuery pageQuery);
}
