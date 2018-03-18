package com.fengbang.dashboard.core.repository;

import com.fengbang.dashboard.core.entity.AuthRole;
import com.fengbang.dashboard.core.util.PageQuery;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthRole
 * @author code-generator 
 */
public interface AuthRoleRepository {
	/**
	 * 单个实体添加
	 *@param :AuthRole
	 *@Return:java.lang.String
	*/
    String insertOne(AuthRole authRole);

    /**
     *动态添加
     *@param: AuthRole
     *@Return:java.lang.String
     */
    String  insertOneSelective(AuthRole authRole);
    
    /**
     *批量保存
     *@param: List<AuthRole>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthRole>
     */
    List<AuthRole> insertList(List<AuthRole> authRoles);
    
    /**
     *单个修改
     *@param: AuthRole
     *@Return:void
     */
    void updateByPrimaryKey(AuthRole authRole);
   
    /**
     *动态修改
     *@param: AuthRole
     *@Return:void
     */
    void updateByPrimaryKeySelective(AuthRole authRole);
    
    /**
     *根据条件修改
     *@param: AuthRole,Example
     *@Return:void
     */
    void updateByExample(AuthRole authRole, Example example);

    /**
     *根据条件动态修改
     *@param: AuthRole,Example
     *@Return:void
     */
    void updateByExampleSelective(AuthRole authRole, Example example);
    
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
    List<AuthRole> selectAll();
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthRole
     */
    AuthRole selectByExample(Example example);
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthRole>
     */
    List<AuthRole> selectByExampleList(Example example);
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthRole
     */
    AuthRole selectByPrimaryKey(String id);
        
    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    void setPageQuery(PageQuery pageQuery);
}
