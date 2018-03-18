package com.fengbang.dashboard.core.service.impl;

import com.fengbang.dashboard.core.repository.AuthUserRoleRepository;
import com.fengbang.dashboard.core.service.AuthUserRoleService;
import com.fengbang.dashboard.core.entity.AuthUserRole;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * AuthUserRole
 * @author code-generator
 */
@Component
public class AuthUserRoleServiceImpl implements AuthUserRoleService{
	 @Autowired
	 public  AuthUserRoleRepository authUserRoleRepository;
	
    /**
     * @param authUserRole
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author code-generator
     * @date 2018-02-27 17:28:51
  */
    @Override
    public String  persistSelective(AuthUserRole authUserRole){
    	String authUserRoleId=authUserRoleRepository.insertOneSelective(authUserRole);
        return  authUserRoleId;
    }
    
    /**
     * @param authUserRole
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author code-generator
     * @date 2018-02-27 17:28:51
     */
    @Override
    public void freshByPrimaryKey(AuthUserRole authUserRole) {
    	authUserRoleRepository.updateByPrimaryKey(authUserRole);
    }

    /**
     * @param authUserRole
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author code-generator
     * @date 2018-02-27 17:28:51
     */
    @Override
    public void freshByPrimaryKeySelective(AuthUserRole authUserRole) {
    	authUserRoleRepository.updateByPrimaryKeySelective(authUserRole);
    }
   
    /**
     * @param authUserRole
     * @param example
     * @return void
     * @throws
     * @Title: freshByExampleSelective
     * @Description: 根据条件动态修改
     * @author code-generator
     * @date 2018-02-27 17:28:51
     */
    @Override
    public void freshByExampleSelective(AuthUserRole authUserRole, Example example){
    	authUserRoleRepository.updateByExampleSelective(authUserRole,example);
    }
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author code-generator
     * @date 2018-02-27 17:28:51
     */
    @Override
    public void erase(String id) {
    	authUserRoleRepository.delete(id);
    }

    /**
     * @return List<AuthUserRole>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author code-generator
     * @date 2018-02-27 17:28:51
     */
    @Override
    public List<AuthUserRole> findAll() {
        return  authUserRoleRepository.selectAll();
    }
    
    /**
     * @param example
     * @return List<AuthUserRole>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author code-generator
     * @date 2018-02-27 17:28:51
     */
    @Override
    public List<AuthUserRole> findByExampleList(Example example) {
        return authUserRoleRepository.selectByExampleList(example);
    }
    /**
     * @param example
     * @return AuthUserRole
     * @throws
     * @Title: findByExample
     * @Description: 通过条件查询
     * @author code-generator
     * @date 2018-02-27 17:28:51
     */
    @Override
    public AuthUserRole findByExample(Example example) {
    	List<AuthUserRole>  authUserRoles=authUserRoleRepository.selectByExampleList(example);
    	 if (authUserRoles != null && authUserRoles.size() > 0) {
    		 return authUserRoles.get(0);
    	 }else {
    		 return null;
    	 }
    }
    /**
     * @param  id
     * @return AuthUserRole
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author code-generator
     * @date 2018-02-27 17:28:51
     */
    @Override
    public AuthUserRole findByPrimaryKey(String id) {
        return authUserRoleRepository.selectByPrimaryKey(id);
    }
}
