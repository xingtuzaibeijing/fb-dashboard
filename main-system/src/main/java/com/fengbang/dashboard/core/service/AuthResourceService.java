package com.fengbang.dashboard.core.service;

import com.fengbang.dashboard.core.entity.AuthResource;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthResource
 * @author code-generator 
 */
public interface AuthResourceService {

    /**
     * @param authResource
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
  */
    String  persistSelective(AuthResource authResource);

    /**
     * @param authResource
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    void freshByPrimaryKey(AuthResource authResource);
   
    /**
     * @param authResource
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    void freshByPrimaryKeySelective(AuthResource authResource);
    

    /**
     * @param authResource
     * @param example
     * @return void
     * @throws
     * @Title: freshByExampleSelective
     * @Description: 根据条件动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    void freshByExampleSelective(AuthResource authResource, Example example);
    
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
     * @return List<AuthResource>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    List<AuthResource> findAll();
    
    
    /**
     * @param example
     * @return List<AuthResource>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    List<AuthResource> findByExampleList(Example example);
    
    /**
     * @param example
     * @return AuthResource
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    AuthResource findByExample(Example example);
    
    /**
     * @param  id
     * @return AuthResource
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    AuthResource findByPrimaryKey(String id);
    
  
}
