package com.fengbang.dashboard.core.repository;

import com.fengbang.dashboard.core.entity.AuthResource;
import com.fengbang.dashboard.core.util.PageQuery;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthResource
 * @author code-generator 
 */
public interface AuthResourceRepository {
	/**
	 * 单个实体添加
	 *@param :AuthResource
	 *@Return:java.lang.String
	*/
    String insertOne(AuthResource authResource);

    /**
     *动态添加
     *@param: AuthResource
     *@Return:java.lang.String
     */
    String  insertOneSelective(AuthResource authResource);
    
    /**
     *批量保存
     *@param: List<AuthResource>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthResource>
     */
    List<AuthResource> insertList(List<AuthResource> authResources);
    
    /**
     *单个修改
     *@param: AuthResource
     *@Return:void
     */
    void updateByPrimaryKey(AuthResource authResource);
   
    /**
     *动态修改
     *@param: AuthResource
     *@Return:void
     */
    void updateByPrimaryKeySelective(AuthResource authResource);
    
    /**
     *根据条件修改
     *@param: AuthResource,Example
     *@Return:void
     */
    void updateByExample(AuthResource authResource, Example example);

    /**
     *根据条件动态修改
     *@param: AuthResource,Example
     *@Return:void
     */
    void updateByExampleSelective(AuthResource authResource, Example example);
    
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
    List<AuthResource> selectAll();
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthResource
     */
    AuthResource selectByExample(Example example);
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthResource>
     */
    List<AuthResource> selectByExampleList(Example example);
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthResource
     */
    AuthResource selectByPrimaryKey(String id);
        
    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    void setPageQuery(PageQuery pageQuery);
}
