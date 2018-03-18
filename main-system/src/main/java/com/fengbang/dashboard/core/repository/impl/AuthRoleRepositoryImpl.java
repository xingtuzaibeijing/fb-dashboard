
package com.fengbang.dashboard.core.repository.impl;

import com.fengbang.dashboard.core.dao.AuthRoleDao;
import com.fengbang.dashboard.core.repository.AuthRoleRepository;
import com.fengbang.dashboard.core.repository.base.AbstractBaseRepository;
import com.fengbang.dashboard.core.entity.AuthRole;
import com.fengbang.dashboard.core.util.PageQuery;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * AuthRole
 * @author code-generator 
 */
@Component
public class AuthRoleRepositoryImpl extends AbstractBaseRepository<AuthRoleDao, AuthRole> implements AuthRoleRepository {
	/**
	 * 单个实体添加
	 *@param :AuthRole
	 *@Return:java.lang.String
	*/
    @Override
    public String insertOne(AuthRole authRole) {
        super.insert(authRole);
        return authRole.getId();
    }
    
    /**
     *动态添加
     *@param: AuthRole
     *@Return:java.lang.String
     */
    @Override
    public String  insertOneSelective(AuthRole authRole){
        super.insertSelective(authRole);
        return  authRole.getId();
    }
    
    /**
     *批量保存
     *@param: List<AuthRole>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthRole>
     */
    @Override
    public List<AuthRole> insertList(List<AuthRole> authRoles){
        super.insertListByMapper(authRoles);
        return authRoles;
    }

    /**
     *单个修改
     *@param: AuthRole
     *@Return:void
     */
    @Override
    public void updateByPrimaryKey(AuthRole authRole) {
        super.updateByPrimaryKey(authRole);
    }

    /**
     *动态修改
     *@param: AuthRole
     *@Return:void
     */
    @Override
    public void updateByPrimaryKeySelective(AuthRole authRole) {
        super.updateByPrimaryKeySelective(authRole);
    }

    /**
     *根据条件修改
     *@param: AuthRole,Example
     *@Return:void
     */
    @Override
    public void updateByExample(AuthRole authRole, Example example ) {
        super.updateByExample(authRole,example);
    }
    
    /**
     *根据条件动态修改
     *@param: AuthRole,Example
     *@Return:void
     */
    @Override
    public void updateByExampleSelective(AuthRole authRole, Example example){
        super.updateByExampleSelective(authRole,example);
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
    public List<AuthRole> selectAll() {
        return  super.selectAll();
    }
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthRole
     */
    @Override
    public AuthRole selectByExample(Example example) {
        return  super.selectOneByExample(example);
    }
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthRole>
     */
    @Override
    public List<AuthRole> selectByExampleList(Example example) {
        return super.selectListByExample(example);
    }
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthRole
     */
    @Override
    public AuthRole selectByPrimaryKey(String id) {
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
