package com.fengbang.dashboard.core.repository;

import com.fengbang.dashboard.core.entity.AuthUserSysId;
import com.fengbang.dashboard.core.util.PageQuery;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthUserSysId
 * @author code-generator 
 */
public interface AuthUserSysIdRepository {
	/**
	 * 单个实体添加
	 *@param :AuthUserSysId
	 *@Return:java.lang.String
	*/
    String insertOne(AuthUserSysId authUserSysId);

    /**
     *动态添加
     *@param: AuthUserSysId
     *@Return:java.lang.String
     */
    String  insertOneSelective(AuthUserSysId authUserSysId);
    
    /**
     *批量保存
     *@param: List<AuthUserSysId>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthUserSysId>
     */
    List<AuthUserSysId> insertList(List<AuthUserSysId> authUserSysIds);
    
    /**
     *单个修改
     *@param: AuthUserSysId
     *@Return:void
     */
    void updateByPrimaryKey(AuthUserSysId authUserSysId);
   
    /**
     *动态修改
     *@param: AuthUserSysId
     *@Return:void
     */
    void updateByPrimaryKeySelective(AuthUserSysId authUserSysId);
    
    /**
     *根据条件修改
     *@param: AuthUserSysId,Example
     *@Return:void
     */
    void updateByExample(AuthUserSysId authUserSysId, Example example);

    /**
     *根据条件动态修改
     *@param: AuthUserSysId,Example
     *@Return:void
     */
    void updateByExampleSelective(AuthUserSysId authUserSysId, Example example);
    
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
    List<AuthUserSysId> selectAll();
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthUserSysId
     */
    AuthUserSysId selectByExample(Example example);
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthUserSysId>
     */
    List<AuthUserSysId> selectByExampleList(Example example);
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthUserSysId
     */
    AuthUserSysId selectByPrimaryKey(String id);
        
    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    void setPageQuery(PageQuery pageQuery);
}
