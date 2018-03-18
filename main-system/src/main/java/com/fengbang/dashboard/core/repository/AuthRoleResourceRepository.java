package com.fengbang.dashboard.core.repository;
import com.fengbang.dashboard.core.entity.AuthRoleResource;
import com.fengbang.dashboard.core.util.PageQuery;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthRoleResource
 * @author code-generator 
 */
public interface AuthRoleResourceRepository {
	/**
	 * 单个实体添加
	 *@param :AuthRoleResource
	 *@Return:java.lang.String
	*/
    String insertOne(AuthRoleResource authRoleResource);

    /**
     *动态添加
     *@param: AuthRoleResource
     *@Return:java.lang.String
     */
    String  insertOneSelective(AuthRoleResource authRoleResource);
    
    /**
     *批量保存
     *@param: List<AuthRoleResource>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthRoleResource>
     */
    List<AuthRoleResource> insertList(List<AuthRoleResource> authRoleResources);
    
    /**
     *单个修改
     *@param: AuthRoleResource
     *@Return:void
     */
    void updateByPrimaryKey(AuthRoleResource authRoleResource);
   
    /**
     *动态修改
     *@param: AuthRoleResource
     *@Return:void
     */
    void updateByPrimaryKeySelective(AuthRoleResource authRoleResource);
    
    /**
     *根据条件修改
     *@param: AuthRoleResource,Example
     *@Return:void
     */
    void updateByExample(AuthRoleResource authRoleResource, Example example);

    /**
     *根据条件动态修改
     *@param: AuthRoleResource,Example
     *@Return:void
     */
    void updateByExampleSelective(AuthRoleResource authRoleResource, Example example);
    
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
    List<AuthRoleResource> selectAll();
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthRoleResource
     */
    AuthRoleResource selectByExample(Example example);
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthRoleResource>
     */
    List<AuthRoleResource> selectByExampleList(Example example);
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthRoleResource
     */
    AuthRoleResource selectByPrimaryKey(String id);
        
    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    void setPageQuery(PageQuery pageQuery);
}
