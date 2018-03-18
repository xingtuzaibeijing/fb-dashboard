package com.fengbang.dashboard.core.service;

import com.fengbang.dashboard.core.entity.AuthClient;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * AuthClient
 * @author code-generator 
 */
public interface AuthClientService {

    /**
     * @param authClient
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
  */
    String  persistSelective(AuthClient authClient);

    /**
     * @param authClient
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    void freshByPrimaryKey(AuthClient authClient);
   
    /**
     * @param authClient
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    void freshByPrimaryKeySelective(AuthClient authClient);
    

    /**
     * @param authClient
     * @param example
     * @return void
     * @throws
     * @Title: freshByExampleSelective
     * @Description: 根据条件动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    void freshByExampleSelective(AuthClient authClient, Example example);
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    void erase(String id);
    
    /**
     * @return List<AuthClient>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    List<AuthClient> findAll();
    
    
    /**
     * @param example
     * @return List<AuthClient>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    List<AuthClient> findByExampleList(Example example);
    
    /**
     * @param example
     * @return AuthClient
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    AuthClient findByExample(Example example);
    
    /**
     * @param  id
     * @return AuthClient
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    AuthClient findByPrimaryKey(String id);
    
  
}
