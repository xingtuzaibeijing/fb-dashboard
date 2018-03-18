
package com.fengbang.dashboard.core.repository.impl;

import com.fengbang.dashboard.core.dao.AuthUserDao;
import com.fengbang.dashboard.core.repository.AuthUserRepository;
import com.fengbang.dashboard.core.repository.base.AbstractBaseRepository;
import com.fengbang.dashboard.core.entity.AuthUser;
import com.fengbang.dashboard.core.util.PageQuery;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * AuthUser
 * @author code-generator 
 */
@Component
public class AuthUserRepositoryImpl extends AbstractBaseRepository<AuthUserDao, AuthUser> implements AuthUserRepository {
	/**
	 * 单个实体添加
	 *@param :AuthUser
	 *@Return:java.lang.String
	*/
    @Override
    public String insertOne(AuthUser authUser) {
        super.insert(authUser);
        return authUser.getId();
    }
    
    /**
     *动态添加
     *@param: AuthUser
     *@Return:java.lang.String
     */
    @Override
    public String  insertOneSelective(AuthUser authUser){
        super.insertSelective(authUser);
        return  authUser.getId();
    }
    
    /**
     *批量保存
     *@param: List<AuthUser>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthUser>
     */
    @Override
    public List<AuthUser> insertList(List<AuthUser> authUsers){
        super.insertListByMapper(authUsers);
        return authUsers;
    }

    /**
     *单个修改
     *@param: AuthUser
     *@Return:void
     */
    @Override
    public void updateByPrimaryKey(AuthUser authUser) {
        super.updateByPrimaryKey(authUser);
    }

    /**
     *动态修改
     *@param: AuthUser
     *@Return:void
     */
    @Override
    public void updateByPrimaryKeySelective(AuthUser authUser) {
        super.updateByPrimaryKeySelective(authUser);
    }

    /**
     *根据条件修改
     *@param: AuthUser,Example
     *@Return:void
     */
    @Override
    public void updateByExample(AuthUser authUser, Example example ) {
        super.updateByExample(authUser,example);
    }
    
    /**
     *根据条件动态修改
     *@param: AuthUser,Example
     *@Return:void
     */
    @Override
    public void updateByExampleSelective(AuthUser authUser, Example example){
        super.updateByExampleSelective(authUser,example);
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
    public List<AuthUser> selectAll() {
        return  super.selectAll();
    }
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthUser
     */
    @Override
    public AuthUser selectByExample(Example example) {
        return  super.selectOneByExample(example);
    }
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthUser>
     */
    @Override
    public List<AuthUser> selectByExampleList(Example example) {
        return super.selectListByExample(example);
    }
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthUser
     */
    @Override
    public AuthUser selectByPrimaryKey(String id) {
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
