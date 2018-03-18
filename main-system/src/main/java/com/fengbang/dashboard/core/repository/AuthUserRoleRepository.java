package com.fengbang.dashboard.core.repository;
import com.fengbang.dashboard.core.entity.AuthUserRole;
import com.fengbang.dashboard.core.util.PageQuery;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthUserRole
 * @author code-generator 
 */
public interface AuthUserRoleRepository {
	/**
	 * 单个实体添加
	 *@param :AuthUserRole
	 *@Return:java.lang.String
	*/
    String insertOne(AuthUserRole authUserRole);

    /**
     *动态添加
     *@param: AuthUserRole
     *@Return:java.lang.String
     */
    String  insertOneSelective(AuthUserRole authUserRole);
    
    /**
     *批量保存
     *@param: List<AuthUserRole>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthUserRole>
     */
    List<AuthUserRole> insertList(List<AuthUserRole> authUserRoles);
    
    /**
     *单个修改
     *@param: AuthUserRole
     *@Return:void
     */
    void updateByPrimaryKey(AuthUserRole authUserRole);
   
    /**
     *动态修改
     *@param: AuthUserRole
     *@Return:void
     */
    void updateByPrimaryKeySelective(AuthUserRole authUserRole);
    
    /**
     *根据条件修改
     *@param: AuthUserRole,Example
     *@Return:void
     */
    void updateByExample(AuthUserRole authUserRole, Example example);

    /**
     *根据条件动态修改
     *@param: AuthUserRole,Example
     *@Return:void
     */
    void updateByExampleSelective(AuthUserRole authUserRole, Example example);
    
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
    List<AuthUserRole> selectAll();
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.AuthUserRole
     */
    AuthUserRole selectByExample(Example example);
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.AuthUserRole>
     */
    List<AuthUserRole> selectByExampleList(Example example);
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.AuthUserRole
     */
    AuthUserRole selectByPrimaryKey(String id);
        
    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    void setPageQuery(PageQuery pageQuery);
}
