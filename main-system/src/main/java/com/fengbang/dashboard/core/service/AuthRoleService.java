package com.fengbang.dashboard.core.service;

import com.fengbang.dashboard.core.entity.AuthRole;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthRole
 * @author code-generator 
 */
public interface AuthRoleService {

    /**
     * @param authRole
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
  */
    String  persistSelective(AuthRole authRole);

    /**
     * @param authRole
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    void freshByPrimaryKey(AuthRole authRole);
   
    /**
     * @param authRole
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    void freshByPrimaryKeySelective(AuthRole authRole);
    

    /**
     * @param authRole
     * @param example
     * @return void
     * @throws
     * @Title: freshByExampleSelective
     * @Description: 根据条件动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    void freshByExampleSelective(AuthRole authRole, Example example);
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    void erase(String id);
    
    /**
     * @return List<AuthRole>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    List<AuthRole> findAll();
    
    
    /**
     * @param example
     * @return List<AuthRole>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    List<AuthRole> findByExampleList(Example example);
    
    /**
     * @param example
     * @return AuthRole
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    AuthRole findByExample(Example example);
    
    /**
     * @param  id
     * @return AuthRole
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    AuthRole findByPrimaryKey(String id);
    
  
}
