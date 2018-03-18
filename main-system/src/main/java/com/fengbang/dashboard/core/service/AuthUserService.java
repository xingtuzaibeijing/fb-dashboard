package com.fengbang.dashboard.core.service;

import com.fengbang.dashboard.core.entity.AuthUser;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthUser
 * @author code-generator 
 */
public interface AuthUserService {

    /**
     * @param authUser
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
  */
    String  persistSelective(AuthUser authUser);

    /**
     * @param authUser
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    void freshByPrimaryKey(AuthUser authUser);
   
    /**
     * @param authUser
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    void freshByPrimaryKeySelective(AuthUser authUser);
    

    /**
     * @param authUser
     * @param example
     * @return void
     * @throws
     * @Title: freshByExampleSelective
     * @Description: 根据条件动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    void freshByExampleSelective(AuthUser authUser, Example example);
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    void erase(String id);
    
    /**
     * @return List<AuthUser>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    List<AuthUser> findAll();
    
    
    /**
     * @param example
     * @return List<AuthUser>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    List<AuthUser> findByExampleList(Example example);
    
    /**
     * @param example
     * @return AuthUser
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    AuthUser findByExample(Example example);
    
    /**
     * @param  id
     * @return AuthUser
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    AuthUser findByPrimaryKey(String id);
    
  
}
