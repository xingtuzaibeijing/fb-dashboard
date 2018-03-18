package com.fengbang.dashboard.core.service;

import com.fengbang.dashboard.core.entity.AuthUserRole;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthUserRole
 * @author code-generator 
 */
public interface AuthUserRoleService {

    /**
     * @param authUserRole
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author code-generator
     * @date 2018-02-27 17:28:50
  */
    String  persistSelective(AuthUserRole authUserRole);

    /**
     * @param authUserRole
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author code-generator
     * @date 2018-02-27 17:28:50
     */
    void freshByPrimaryKey(AuthUserRole authUserRole);
   
    /**
     * @param authUserRole
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author code-generator
     * @date 2018-02-27 17:28:50
     */
    void freshByPrimaryKeySelective(AuthUserRole authUserRole);
    

    /**
     * @param authUserRole
     * @param example
     * @return void
     * @throws
     * @Title: freshByExampleSelective
     * @Description: 根据条件动态修改
     * @author code-generator
     * @date 2018-02-27 17:28:50
     */
    void freshByExampleSelective(AuthUserRole authUserRole, Example example);
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author code-generator
     * @date 2018-02-27 17:28:50
     */
    void erase(String id);
    
    /**
     * @return List<AuthUserRole>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author code-generator
     * @date 2018-02-27 17:28:50
     */
    List<AuthUserRole> findAll();
    
    
    /**
     * @param example
     * @return List<AuthUserRole>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author code-generator
     * @date 2018-02-27 17:28:50
     */
    List<AuthUserRole> findByExampleList(Example example);
    
    /**
     * @param example
     * @return AuthUserRole
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件查询
     * @author code-generator
     * @date 2018-02-27 17:28:50
     */
    AuthUserRole findByExample(Example example);
    
    /**
     * @param  id
     * @return AuthUserRole
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author code-generator
     * @date 2018-02-27 17:28:50
     */
    AuthUserRole findByPrimaryKey(String id);
    
  
}
