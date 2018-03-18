package com.fengbang.dashboard.core.service;

import com.fengbang.dashboard.core.entity.User;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * User
 * @author code-generator 
 */
public interface UserService {

    /**
     * @param user
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author code-generator
     * @date 2018-02-20 12:15:31
  */
    String  persistSelective(User user);

    /**
     * @param user
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    void freshByPrimaryKey(User user);
   
    /**
     * @param user
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    void freshByPrimaryKeySelective(User user);
    

    /**
     * @param user
     * @param example
     * @return void
     * @throws
     * @Title: freshByExampleSelective
     * @Description: 根据条件动态修改
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    void freshByExampleSelective(User user, Example example);
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    void erase(String id);
    
    /**
     * @return List<User>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    List<User> findAll();
    
    
    /**
     * @param example
     * @return List<User>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    List<User> findByExampleList(Example example);
    
    /**
     * @param example
     * @return User
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件查询
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    User findByExample(Example example);
    
    /**
     * @param  id
     * @return User
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    User findByPrimaryKey(String id);
    
  
}
