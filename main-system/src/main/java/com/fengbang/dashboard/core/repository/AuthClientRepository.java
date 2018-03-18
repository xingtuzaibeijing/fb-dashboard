package com.fengbang.dashboard.core.repository;

import com.fengbang.dashboard.core.entity.AuthClient;
import com.fengbang.dashboard.core.util.PageQuery;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthClient
 * @author code-generator 
 */
public interface AuthClientRepository {
	/**
	 * 单个实体添加
	 *@param :AuthClient
	 *@Return:java.lang.String
	*/
    String insertOne(AuthClient authClient);

    /**
     *动态添加
     *@param: AuthClient
     *@Return:java.lang.String
     */
    String  insertOneSelective(AuthClient authClient);
    
    /**
     *批量保存
     *@param: List<AuthClient>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthClient>
     */
    List<AuthClient> insertList(List<AuthClient> authClients);
    
    /**
     *单个修改
     *@param: AuthClient
     *@Return:void
     */
    void updateByPrimaryKey(AuthClient authClient);
   
    /**
     *动态修改
     *@param: AuthClient
     *@Return:void
     */
    void updateByPrimaryKeySelective(AuthClient authClient);
    
    /**
     *根据条件修改
     *@param: AuthClient,Example
     *@Return:void
     */
    void updateByExample(AuthClient authClient, Example example);

    /**
     *根据条件动态修改
     *@param: AuthClient,Example
     *@Return:void
     */
    void updateByExampleSelective(AuthClient authClient, Example example);
    
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
    List<AuthClient> selectAll();
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthClient
     */
    AuthClient selectByExample(Example example);
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthClient>
     */
    List<AuthClient> selectByExampleList(Example example);
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthClient
     */
    AuthClient selectByPrimaryKey(String id);
        
    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    void setPageQuery(PageQuery pageQuery);
}
