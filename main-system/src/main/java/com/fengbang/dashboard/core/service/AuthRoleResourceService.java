package com.fengbang.dashboard.core.service;

import com.fengbang.dashboard.core.entity.AuthRoleResource;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthRoleResource
 * @author code-generator 
 */
public interface AuthRoleResourceService {

    /**
     * @param authRoleResource
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
  */
    String  persistSelective(AuthRoleResource authRoleResource);

    /**
     * @param authRoleResource
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    void freshByPrimaryKey(AuthRoleResource authRoleResource);
   
    /**
     * @param authRoleResource
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    void freshByPrimaryKeySelective(AuthRoleResource authRoleResource);
    

    /**
     * @param authRoleResource
     * @param example
     * @return void
     * @throws
     * @Title: freshByExampleSelective
     * @Description: 根据条件动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    void freshByExampleSelective(AuthRoleResource authRoleResource, Example example);
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    void erase(String id);
    
    /**
     * @return List<AuthRoleResource>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    List<AuthRoleResource> findAll();
    
    
    /**
     * @param example
     * @return List<AuthRoleResource>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    List<AuthRoleResource> findByExampleList(Example example);
    
    /**
     * @param example
     * @return AuthRoleResource
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    AuthRoleResource findByExample(Example example);
    
    /**
     * @param  id
     * @return AuthRoleResource
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    AuthRoleResource findByPrimaryKey(String id);
    
  
}
