package com.fengbang.dashboard.core.repository.impl;

import com.fengbang.dashboard.core.config.TargetDataSource;
import com.fengbang.dashboard.core.dao.AuthRoleResourceDao;
import com.fengbang.dashboard.core.repository.AuthRoleResourceRepository;
import com.fengbang.dashboard.core.repository.base.AbstractBaseRepository;
import com.fengbang.dashboard.core.entity.AuthRoleResource;
import com.fengbang.dashboard.core.util.PageQuery;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * AuthRoleResource
 * @author code-generator
 */
@Component
public class AuthRoleResourceRepositoryImpl extends AbstractBaseRepository<AuthRoleResourceDao, AuthRoleResource> implements AuthRoleResourceRepository {
	/**
	 * 单个实体添加
	 *@param :AuthRoleResource
	 *@Return:java.lang.String
	*/
    @Override
    @TargetDataSource(name="ds1")
    public String insertOne(AuthRoleResource authRoleResource) {
        super.insert(authRoleResource);
        return authRoleResource.getId();
    }

    /**
     *动态添加
     *@param: AuthRoleResource
     *@Return:java.lang.String
     */
    @TargetDataSource(name="ds1")
    @Override
    public String  insertOneSelective(AuthRoleResource authRoleResource){
        super.insertSelective(authRoleResource);
        return  authRoleResource.getId();
    }

    /**
     *批量保存
     *@param: List<AuthRoleResource>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthRoleResource>
     */
    @TargetDataSource(name="ds1")
    @Override
    public List<AuthRoleResource> insertList(List<AuthRoleResource> authRoleResources){
        super.insertListByMapper(authRoleResources);
        return authRoleResources;
    }

    /**
     *单个修改
     *@param: AuthRoleResource
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void updateByPrimaryKey(AuthRoleResource authRoleResource) {
        super.updateByPrimaryKey(authRoleResource);
    }

    /**
     *动态修改
     *@param: AuthRoleResource
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void updateByPrimaryKeySelective(AuthRoleResource authRoleResource) {
        super.updateByPrimaryKeySelective(authRoleResource);
    }

    /**
     *根据条件修改
     *@param: AuthRoleResource,Example
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void updateByExample(AuthRoleResource authRoleResource, Example example ) {
        super.updateByExample(authRoleResource,example);
    }

    /**
     *根据条件动态修改
     *@param: AuthRoleResource,Example
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void updateByExampleSelective(AuthRoleResource authRoleResource, Example example){
        super.updateByExampleSelective(authRoleResource,example);
    }

    /**
     *根据ID删除
     *@param: String
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
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
    public List<AuthRoleResource> selectAll() {
        return  super.selectAll();
    }

    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthRoleResource
     */
    @TargetDataSource(name="ds1")
    @Override
    public AuthRoleResource selectByExample(Example example) {
        return  super.selectOneByExample(example);
    }

    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthRoleResource>
     */
    @TargetDataSource(name="ds1")
    @Override
    public List<AuthRoleResource> selectByExampleList(Example example) {
        return super.selectListByExample(example);
    }

    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthRoleResource
     */
    @TargetDataSource(name="ds1")
    @Override
    public AuthRoleResource selectByPrimaryKey(String id) {
        return super.selectByPrimaryKey(id);
    }

    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void setPageQuery(PageQuery pageQuery) {
        super.setPageQuery(pageQuery);
    }
}
