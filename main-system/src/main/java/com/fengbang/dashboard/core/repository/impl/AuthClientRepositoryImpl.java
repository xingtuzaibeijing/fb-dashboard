
package com.fengbang.dashboard.core.repository.impl;

import com.fengbang.dashboard.core.dao.AuthClientDao;
import com.fengbang.dashboard.core.repository.AuthClientRepository;
import com.fengbang.dashboard.core.repository.base.AbstractBaseRepository;
import com.fengbang.dashboard.core.entity.AuthClient;
import com.fengbang.dashboard.core.util.PageQuery;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * AuthClient
 * @author code-generator 
 */
@Component
public class AuthClientRepositoryImpl extends AbstractBaseRepository<AuthClientDao, AuthClient> implements AuthClientRepository {
	/**
	 * 单个实体添加
	 *@param :AuthClient
	 *@Return:java.lang.String
	*/
    @Override
    public String insertOne(AuthClient authClient) {
        super.insert(authClient);
        return authClient.getId();
    }
    
    /**
     *动态添加
     *@param: AuthClient
     *@Return:java.lang.String
     */
    @Override
    public String  insertOneSelective(AuthClient authClient){
        super.insertSelective(authClient);
        return  authClient.getId();
    }
    
    /**
     *批量保存
     *@param: List<AuthClient>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthClient>
     */
    @Override
    public List<AuthClient> insertList(List<AuthClient> authClients){
        super.insertListByMapper(authClients);
        return authClients;
    }

    /**
     *单个修改
     *@param: AuthClient
     *@Return:void
     */
    @Override
    public void updateByPrimaryKey(AuthClient authClient) {
        super.updateByPrimaryKey(authClient);
    }

    /**
     *动态修改
     *@param: AuthClient
     *@Return:void
     */
    @Override
    public void updateByPrimaryKeySelective(AuthClient authClient) {
        super.updateByPrimaryKeySelective(authClient);
    }

    /**
     *根据条件修改
     *@param: AuthClient,Example
     *@Return:void
     */
    @Override
    public void updateByExample(AuthClient authClient, Example example ) {
        super.updateByExample(authClient,example);
    }
    
    /**
     *根据条件动态修改
     *@param: AuthClient,Example
     *@Return:void
     */
    @Override
    public void updateByExampleSelective(AuthClient authClient, Example example){
        super.updateByExampleSelective(authClient,example);
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
    public List<AuthClient> selectAll() {
        return  super.selectAll();
    }
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthClient
     */
    @Override
    public AuthClient selectByExample(Example example) {
        return  super.selectOneByExample(example);
    }
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthClient>
     */
    @Override
    public List<AuthClient> selectByExampleList(Example example) {
        return super.selectListByExample(example);
    }
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthClient
     */
    @Override
    public AuthClient selectByPrimaryKey(String id) {
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
