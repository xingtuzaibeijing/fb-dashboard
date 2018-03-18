package com.fengbang.dashboard.core.service.impl;

import com.fengbang.dashboard.core.repository.UserRepository;
import com.fengbang.dashboard.core.service.UserService;
import com.fengbang.dashboard.core.entity.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * User
 * @author code-generator
 */
@Component
public class UserServiceImpl implements UserService{
	 @Autowired
	 public  UserRepository userRepository;
	
    /**
     * @param user
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author code-generator
     * @date 2018-02-20 12:15:31
  */
    @Override
    public String  persistSelective(User user){
    	String userId=userRepository.insertOneSelective(user);
        return  userId;
    }
    
    /**
     * @param user
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    @Override
    public void freshByPrimaryKey(User user) {
    	userRepository.updateByPrimaryKey(user);
    }

    /**
     * @param user
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    @Override
    public void freshByPrimaryKeySelective(User user) {
    	userRepository.updateByPrimaryKeySelective(user);
    }
   
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
    @Override
    public void freshByExampleSelective(User user, Example example){
    	userRepository.updateByExampleSelective(user,example);
    }
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    @Override
    public void erase(String id) {
    	userRepository.delete(id);
    }

    /**
     * @return List<User>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    @Override
    public List<User> findAll() {
        return  userRepository.selectAll();
    }
    
    /**
     * @param example
     * @return List<User>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    @Override
    public List<User> findByExampleList(Example example) {
        return userRepository.selectByExampleList(example);
    }
    /**
     * @param example
     * @return User
     * @throws
     * @Title: findByExample
     * @Description: 通过条件查询
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    @Override
    public User findByExample(Example example) {
    	List<User>  users=userRepository.selectByExampleList(example);
    	 if (users != null && users.size() > 0) {
    		 return users.get(0);
    	 }else {
    		 return null;
    	 }
    }
    /**
     * @param  id
     * @return User
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author code-generator
     * @date 2018-02-20 12:15:31
     */
    @Override
    public User findByPrimaryKey(String id) {
        return userRepository.selectByPrimaryKey(id);
    }
}
