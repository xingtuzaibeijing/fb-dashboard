package com.fengbang.dashboard.core.repository;
import com.fengbang.dashboard.core.entity.User;
import com.fengbang.dashboard.core.util.PageQuery;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * User
 * @author code-generator 
 */
public interface UserRepository {
	/**
	 * 单个实体添加
	 *@param :User
	 *@Return:java.lang.String
	*/
    String insertOne(User user);

    /**
     *动态添加
     *@param: User
     *@Return:java.lang.String
     */
    String  insertOneSelective(User user);
    
    /**
     *批量保存
     *@param: List<User>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.User>
     */
    List<User> insertList(List<User> users);
    
    /**
     *单个修改
     *@param: User
     *@Return:void
     */
    void updateByPrimaryKey(User user);
   
    /**
     *动态修改
     *@param: User
     *@Return:void
     */
    void updateByPrimaryKeySelective(User user);
    
    /**
     *根据条件修改
     *@param: User,Example
     *@Return:void
     */
    void updateByExample(User user, Example example);

    /**
     *根据条件动态修改
     *@param: User,Example
     *@Return:void
     */
    void updateByExampleSelective(User user, Example example);
    
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
    List<User> selectAll();
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.User
     */
    User selectByExample(Example example);
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.User>
     */
    List<User> selectByExampleList(Example example);
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.User
     */
    User selectByPrimaryKey(String id);
        
    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    void setPageQuery(PageQuery pageQuery);
}
