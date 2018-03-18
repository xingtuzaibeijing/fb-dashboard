package com.fengbang.dashboard.core.service.impl;

import com.fengbang.dashboard.core.repository.AuthUserRepository;
import com.fengbang.dashboard.core.service.AuthUserService;
import com.fengbang.dashboard.core.entity.AuthUser;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * AuthUser
 * @author QianHuaSheng
 */
@Component
public class AuthUserServiceImpl implements AuthUserService{
	 @Autowired
	 public  AuthUserRepository authUserRepository;
	
    /**
     * @param authUser
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
  */
    @Override
    public String  persistSelective(AuthUser authUser){
    	String authUserId=authUserRepository.insertOneSelective(authUser);
        return  authUserId;
    }
    
    /**
     * @param authUser
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    @Override
    public void freshByPrimaryKey(AuthUser authUser) {
    	authUserRepository.updateByPrimaryKey(authUser);
    }

    /**
     * @param authUser
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    @Override
    public void freshByPrimaryKeySelective(AuthUser authUser) {
    	authUserRepository.updateByPrimaryKeySelective(authUser);
    }
   
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
    @Override
    public void freshByExampleSelective(AuthUser authUser, Example example){
    	authUserRepository.updateByExampleSelective(authUser,example);
    }
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    @Override
    public void erase(String id) {
    	authUserRepository.delete(id);
    }

    /**
     * @return List<AuthUser>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    @Override
    public List<AuthUser> findAll() {
        return  authUserRepository.selectAll();
    }
    
    /**
     * @param example
     * @return List<AuthUser>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    @Override
    public List<AuthUser> findByExampleList(Example example) {
        return authUserRepository.selectByExampleList(example);
    }
    /**
     * @param example
     * @return AuthUser
     * @throws
     * @Title: findByExample
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    @Override
    public AuthUser findByExample(Example example) {
    	List<AuthUser>  authUsers=authUserRepository.selectByExampleList(example);
    	 if (authUsers != null && authUsers.size() > 0) {
    		 return authUsers.get(0);
    	 }else {
    		 return null;
    	 }
    }
    /**
     * @param  id
     * @return AuthUser
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:36
     */
    @Override
    public AuthUser findByPrimaryKey(String id) {
        return authUserRepository.selectByPrimaryKey(id);
    }
}
