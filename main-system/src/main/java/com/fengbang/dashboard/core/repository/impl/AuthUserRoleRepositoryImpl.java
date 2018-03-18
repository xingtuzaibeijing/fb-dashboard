package com.fengbang.dashboard.core.repository.impl;

import com.fengbang.dashboard.core.config.TargetDataSource;
import com.fengbang.dashboard.core.dao.AuthUserRoleDao;
import com.fengbang.dashboard.core.repository.AuthUserRoleRepository;
import com.fengbang.dashboard.core.repository.base.AbstractBaseRepository;
import com.fengbang.dashboard.core.entity.AuthUserRole;
import com.fengbang.dashboard.core.util.PageQuery;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * AuthUserRole
 * @author code-generator
 */
@Component
public class AuthUserRoleRepositoryImpl extends AbstractBaseRepository<AuthUserRoleDao, AuthUserRole> implements AuthUserRoleRepository {
	/**
	 * 单个实体添加
	 *@param :AuthUserRole
	 *@Return:java.lang.String
	*/
    @Override
    @TargetDataSource(name="ds1")
    public String insertOne(AuthUserRole authUserRole) {
        super.insert(authUserRole);
        return authUserRole.getId();
    }

    /**
     *动态添加
     *@param: AuthUserRole
     *@Return:java.lang.String
     */
    @TargetDataSource(name="ds1")
    @Override
    public String  insertOneSelective(AuthUserRole authUserRole){
        super.insertSelective(authUserRole);
        return  authUserRole.getId();
    }

    /**
     *批量保存
     *@param: List<AuthUserRole>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthUserRole>
     */
    @TargetDataSource(name="ds1")
    @Override
    public List<AuthUserRole> insertList(List<AuthUserRole> authUserRoles){
        super.insertListByMapper(authUserRoles);
        return authUserRoles;
    }

    /**
     *单个修改
     *@param: AuthUserRole
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void updateByPrimaryKey(AuthUserRole authUserRole) {
        super.updateByPrimaryKey(authUserRole);
    }

    /**
     *动态修改
     *@param: AuthUserRole
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void updateByPrimaryKeySelective(AuthUserRole authUserRole) {
        super.updateByPrimaryKeySelective(authUserRole);
    }

    /**
     *根据条件修改
     *@param: AuthUserRole,Example
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void updateByExample(AuthUserRole authUserRole, Example example ) {
        super.updateByExample(authUserRole,example);
    }

    /**
     *根据条件动态修改
     *@param: AuthUserRole,Example
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void updateByExampleSelective(AuthUserRole authUserRole, Example example){
        super.updateByExampleSelective(authUserRole,example);
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
    public List<AuthUserRole> selectAll() {
        return  super.selectAll();
    }

    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthUserRole
     */
    @TargetDataSource(name="ds1")
    @Override
    public AuthUserRole selectByExample(Example example) {
        return  super.selectOneByExample(example);
    }

    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthUserRole>
     */
    @TargetDataSource(name="ds1")
    @Override
    public List<AuthUserRole> selectByExampleList(Example example) {
        return super.selectListByExample(example);
    }

    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthUserRole
     */
    @TargetDataSource(name="ds1")
    @Override
    public AuthUserRole selectByPrimaryKey(String id) {
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
