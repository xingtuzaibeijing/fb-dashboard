package com.fengbang.dashboard.core.repository;

import com.fengbang.dashboard.core.entity.AuthUser;
import com.fengbang.dashboard.core.util.PageQuery;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthUser
 * @author code-generator 
 */
public interface AuthUserRepository {
	/**
	 * 单个实体添加
	 *@param :AuthUser
	 *@Return:java.lang.String
	*/
    String insertOne(AuthUser authUser);

    /**
     *动态添加
     *@param: AuthUser
     *@Return:java.lang.String
     */
    String  insertOneSelective(AuthUser authUser);
    
    /**
     *批量保存
     *@param: List<AuthUser>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthUser>
     */
    List<AuthUser> insertList(List<AuthUser> authUsers);
    
    /**
     *单个修改
     *@param: AuthUser
     *@Return:void
     */
    void updateByPrimaryKey(AuthUser authUser);
   
    /**
     *动态修改
     *@param: AuthUser
     *@Return:void
     */
    void updateByPrimaryKeySelective(AuthUser authUser);
    
    /**
     *根据条件修改
     *@param: AuthUser,Example
     *@Return:void
     */
    void updateByExample(AuthUser authUser, Example example);

    /**
     *根据条件动态修改
     *@param: AuthUser,Example
     *@Return:void
     */
    void updateByExampleSelective(AuthUser authUser, Example example);
    
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
    List<AuthUser> selectAll();
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthUser
     */
    AuthUser selectByExample(Example example);
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthUser>
     */
    List<AuthUser> selectByExampleList(Example example);
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthUser
     */
    AuthUser selectByPrimaryKey(String id);
        
    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    void setPageQuery(PageQuery pageQuery);
}
