package com.fengbang.dashboard.core.service;

import com.fengbang.dashboard.core.entity.AuthUserSysId;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthUserSysId
 * @author code-generator 
 */
public interface AuthUserSysIdService {

    /**
     * @param authUserSysId
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
  */
    String  persistSelective(AuthUserSysId authUserSysId);

    /**
     * @param authUserSysId
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    void freshByPrimaryKey(AuthUserSysId authUserSysId);
   
    /**
     * @param authUserSysId
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    void freshByPrimaryKeySelective(AuthUserSysId authUserSysId);
    

    /**
     * @param authUserSysId
     * @param example
     * @return void
     * @throws
     * @Title: freshByExampleSelective
     * @Description: 根据条件动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    void freshByExampleSelective(AuthUserSysId authUserSysId, Example example);
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    void erase(String id);
    
    /**
     * @return List<AuthUserSysId>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    List<AuthUserSysId> findAll();
    
    
    /**
     * @param example
     * @return List<AuthUserSysId>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    List<AuthUserSysId> findByExampleList(Example example);
    
    /**
     * @param example
     * @return AuthUserSysId
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    AuthUserSysId findByExample(Example example);
    
    /**
     * @param  id
     * @return AuthUserSysId
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    AuthUserSysId findByPrimaryKey(String id);
    
  
}
