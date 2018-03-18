package com.fengbang.dashboard.core.repository.impl;

import com.fengbang.dashboard.core.dao.UserDao;
import com.fengbang.dashboard.core.repository.UserRepository;
import com.fengbang.dashboard.core.repository.base.AbstractBaseRepository;
import com.fengbang.dashboard.core.entity.User;
import com.fengbang.dashboard.core.util.PageQuery;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * User
 * @author code-generator 
 */
@Component
public class UserRepositoryImpl extends AbstractBaseRepository<UserDao, User> implements UserRepository {
	/**
	 * 单个实体添加
	 *@param :User
	 *@Return:java.lang.String
	*/
    @Override
    public String insertOne(User user) {
        super.insert(user);
        return user.getId();
    }
    
    /**
     *动态添加
     *@param: User
     *@Return:java.lang.String
     */
    @Override
    public String  insertOneSelective(User user){
        super.insertSelective(user);
        return  user.getId();
    }
    
    /**
     *批量保存
     *@param: List<User>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.User>
     */
    @Override
    public List<User> insertList(List<User> users){
        super.insertListByMapper(users);
        return users;
    }

    /**
     *单个修改
     *@param: User
     *@Return:void
     */
    @Override
    public void updateByPrimaryKey(User user) {
        super.updateByPrimaryKey(user);
    }

    /**
     *动态修改
     *@param: User
     *@Return:void
     */
    @Override
    public void updateByPrimaryKeySelective(User user) {
        super.updateByPrimaryKeySelective(user);
    }

    /**
     *根据条件修改
     *@param: User,Example
     *@Return:void
     */
    @Override
    public void updateByExample(User user, Example example ) {
        super.updateByExample(user,example);
    }
    
    /**
     *根据条件动态修改
     *@param: User,Example
     *@Return:void
     */
    @Override
    public void updateByExampleSelective(User user, Example example){
        super.updateByExampleSelective(user,example);
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
    public List<User> selectAll() {
        return  super.selectAll();
    }
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.User
     */
    @Override
    public User selectByExample(Example example) {
        return  super.selectOneByExample(example);
    }
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.User>
     */
    @Override
    public List<User> selectByExampleList(Example example) {
        return super.selectListByExample(example);
    }
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.User
     */
    @Override
    public User selectByPrimaryKey(String id) {
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
