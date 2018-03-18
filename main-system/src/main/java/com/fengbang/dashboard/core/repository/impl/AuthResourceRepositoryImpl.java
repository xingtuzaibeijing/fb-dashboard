package com.fengbang.dashboard.core.repository.impl;

import com.fengbang.dashboard.core.config.TargetDataSource;
import com.fengbang.dashboard.core.dao.AuthResourceDao;
import com.fengbang.dashboard.core.repository.AuthResourceRepository;
import com.fengbang.dashboard.core.repository.base.AbstractBaseRepository;
import com.fengbang.dashboard.core.entity.AuthResource;
import com.fengbang.dashboard.core.util.PageQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * AuthResource
 * @author code-generator 
 */
@Component
public class AuthResourceRepositoryImpl extends AbstractBaseRepository<AuthResourceDao, AuthResource> implements AuthResourceRepository {
	/**
	 * 单个实体添加
	 *@param :AuthResource
	 *@Return:java.lang.String
	*/
    @Override
    public String insertOne(AuthResource authResource) {
        super.insert(authResource);
        return authResource.getId();
    }
    
    /**
     *动态添加
     *@param: AuthResource
     *@Return:java.lang.String
     */
    //
    @TargetDataSource(name="ds1")
    @Transactional
    @Override
    public String  insertOneSelective(AuthResource authResource){
        super.insertSelective(authResource);
        return  authResource.getId();
    }
    
    /**
     *批量保存
     *@param: List<AuthResource>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthResource>
     */
    @Override
    public List<AuthResource> insertList(List<AuthResource> authResources){
        super.insertListByMapper(authResources);
        return authResources;
    }

    /**
     *单个修改
     *@param: AuthResource
     *@Return:void
     */
    @Override
    @TargetDataSource(name="ds1")
    public void updateByPrimaryKey(AuthResource authResource) {
        super.updateByPrimaryKey(authResource);
    }

    /**
     *动态修改
     *@param: AuthResource
     *@Return:void
     */
    @Override
    @Transactional
    @TargetDataSource(name="ds1")
    public void updateByPrimaryKeySelective(AuthResource authResource) {
        super.updateByPrimaryKeySelective(authResource);
    }

    /**
     *根据条件修改
     *@param: AuthResource,Example
     *@Return:void
     */
    @Override
    public void updateByExample(AuthResource authResource, Example example ) {
        super.updateByExample(authResource,example);
    }
    
    /**
     *根据条件动态修改
     *@param: AuthResource,Example
     *@Return:void
     */
    @Override
    public void updateByExampleSelective(AuthResource authResource, Example example){
        super.updateByExampleSelective(authResource,example);
    }
    
    /**
     *根据ID删除
     *@param: String
     *@Return:void
     */
    @Override
    @Transactional
    @TargetDataSource(name="ds1")
    public void delete(String id) {
        super.delete(id);
    }

    /**
     *全部查询
     *@param:void
     *@Return:java.util.List
     */
    @TargetDataSource(name="ds1")
    @Override
    public List<AuthResource> selectAll() {
        return  super.selectAll();
    }
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthResource
     */
    @Override
    public AuthResource selectByExample(Example example) {
        return  super.selectOneByExample(example);
    }
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthResource>
     */
    @Override
    public List<AuthResource> selectByExampleList(Example example) {
        return super.selectListByExample(example);
    }
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthResource
     */
    @TargetDataSource(name="ds1")
    @Override
    public AuthResource selectByPrimaryKey(String id) {
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
