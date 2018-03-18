
package com.fengbang.dashboard.core.repository.impl;

import com.fengbang.dashboard.core.dao.AuthUserSysIdDao;
import com.fengbang.dashboard.core.repository.AuthUserSysIdRepository;
import com.fengbang.dashboard.core.repository.base.AbstractBaseRepository;
import com.fengbang.dashboard.core.entity.AuthUserSysId;
import com.fengbang.dashboard.core.util.PageQuery;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * AuthUserSysId
 * @author code-generator 
 */
@Component
public class AuthUserSysIdRepositoryImpl extends AbstractBaseRepository<AuthUserSysIdDao, AuthUserSysId> implements AuthUserSysIdRepository {
	/**
	 * 单个实体添加
	 *@param :AuthUserSysId
	 *@Return:java.lang.String
	*/
    @Override
    public String insertOne(AuthUserSysId authUserSysId) {
        super.insert(authUserSysId);
        return authUserSysId.getId();
    }
    
    /**
     *动态添加
     *@param: AuthUserSysId
     *@Return:java.lang.String
     */
    @Override
    public String  insertOneSelective(AuthUserSysId authUserSysId){
        super.insertSelective(authUserSysId);
        return  authUserSysId.getId();
    }
    
    /**
     *批量保存
     *@param: List<AuthUserSysId>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthUserSysId>
     */
    @Override
    public List<AuthUserSysId> insertList(List<AuthUserSysId> authUserSysIds){
        super.insertListByMapper(authUserSysIds);
        return authUserSysIds;
    }

    /**
     *单个修改
     *@param: AuthUserSysId
     *@Return:void
     */
    @Override
    public void updateByPrimaryKey(AuthUserSysId authUserSysId) {
        super.updateByPrimaryKey(authUserSysId);
    }

    /**
     *动态修改
     *@param: AuthUserSysId
     *@Return:void
     */
    @Override
    public void updateByPrimaryKeySelective(AuthUserSysId authUserSysId) {
        super.updateByPrimaryKeySelective(authUserSysId);
    }

    /**
     *根据条件修改
     *@param: AuthUserSysId,Example
     *@Return:void
     */
    @Override
    public void updateByExample(AuthUserSysId authUserSysId, Example example ) {
        super.updateByExample(authUserSysId,example);
    }
    
    /**
     *根据条件动态修改
     *@param: AuthUserSysId,Example
     *@Return:void
     */
    @Override
    public void updateByExampleSelective(AuthUserSysId authUserSysId, Example example){
        super.updateByExampleSelective(authUserSysId,example);
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
    public List<AuthUserSysId> selectAll() {
        return  super.selectAll();
    }
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthUserSysId
     */
    @Override
    public AuthUserSysId selectByExample(Example example) {
        return  super.selectOneByExample(example);
    }
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthUserSysId>
     */
    @Override
    public List<AuthUserSysId> selectByExampleList(Example example) {
        return super.selectListByExample(example);
    }
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthUserSysId
     */
    @Override
    public AuthUserSysId selectByPrimaryKey(String id) {
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
