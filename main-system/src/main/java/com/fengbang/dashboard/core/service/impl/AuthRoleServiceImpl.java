package com.fengbang.dashboard.core.service.impl;

import com.fengbang.dashboard.core.repository.AuthRoleRepository;
import com.fengbang.dashboard.core.service.AuthRoleService;
import com.fengbang.dashboard.core.entity.AuthRole;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * AuthRole
 * @author QianHuaSheng
 */
@Component
public class AuthRoleServiceImpl implements AuthRoleService{
	 @Autowired
	 public  AuthRoleRepository authRoleRepository;
	
    /**
     * @param authRole
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
  */
    @Override
    public String  persistSelective(AuthRole authRole){
    	String authRoleId=authRoleRepository.insertOneSelective(authRole);
        return  authRoleId;
    }
    
    /**
     * @param authRole
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    @Override
    public void freshByPrimaryKey(AuthRole authRole) {
    	authRoleRepository.updateByPrimaryKey(authRole);
    }

    /**
     * @param authRole
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    @Override
    public void freshByPrimaryKeySelective(AuthRole authRole) {
    	authRoleRepository.updateByPrimaryKeySelective(authRole);
    }
   
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
    @Override
    public void freshByExampleSelective(AuthRole authRole, Example example){
    	authRoleRepository.updateByExampleSelective(authRole,example);
    }
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    @Override
    public void erase(String id) {
    	authRoleRepository.delete(id);
    }

    /**
     * @return List<AuthRole>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    @Override
    public List<AuthRole> findAll() {
        return  authRoleRepository.selectAll();
    }
    
    /**
     * @param example
     * @return List<AuthRole>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    @Override
    public List<AuthRole> findByExampleList(Example example) {
        return authRoleRepository.selectByExampleList(example);
    }
    /**
     * @param example
     * @return AuthRole
     * @throws
     * @Title: findByExample
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    @Override
    public AuthRole findByExample(Example example) {
    	List<AuthRole>  authRoles=authRoleRepository.selectByExampleList(example);
    	 if (authRoles != null && authRoles.size() > 0) {
    		 return authRoles.get(0);
    	 }else {
    		 return null;
    	 }
    }
    /**
     * @param  id
     * @return AuthRole
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    @Override
    public AuthRole findByPrimaryKey(String id) {
        return authRoleRepository.selectByPrimaryKey(id);
    }
}
