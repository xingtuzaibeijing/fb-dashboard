package com.fengbang.dashboard.core.service.impl;

import com.fengbang.dashboard.core.repository.AuthRoleResourceRepository;
import com.fengbang.dashboard.core.service.AuthRoleResourceService;
import com.fengbang.dashboard.core.entity.AuthRoleResource;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * AuthRoleResource
 * @author QianHuaSheng
 */
@Component
public class AuthRoleResourceServiceImpl implements AuthRoleResourceService{
	 @Autowired
	 public  AuthRoleResourceRepository authRoleResourceRepository;
	
    /**
     * @param authRoleResource
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
  */
    @Override
    public String  persistSelective(AuthRoleResource authRoleResource){
    	String authRoleResourceId=authRoleResourceRepository.insertOneSelective(authRoleResource);
        return  authRoleResourceId;
    }
    
    /**
     * @param authRoleResource
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    @Override
    public void freshByPrimaryKey(AuthRoleResource authRoleResource) {
    	authRoleResourceRepository.updateByPrimaryKey(authRoleResource);
    }

    /**
     * @param authRoleResource
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    @Override
    public void freshByPrimaryKeySelective(AuthRoleResource authRoleResource) {
    	authRoleResourceRepository.updateByPrimaryKeySelective(authRoleResource);
    }
   
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
    @Override
    public void freshByExampleSelective(AuthRoleResource authRoleResource, Example example){
    	authRoleResourceRepository.updateByExampleSelective(authRoleResource,example);
    }
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    @Override
    public void erase(String id) {
    	authRoleResourceRepository.delete(id);
    }

    /**
     * @return List<AuthRoleResource>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    @Override
    public List<AuthRoleResource> findAll() {
        return  authRoleResourceRepository.selectAll();
    }
    
    /**
     * @param example
     * @return List<AuthRoleResource>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    @Override
    public List<AuthRoleResource> findByExampleList(Example example) {
        return authRoleResourceRepository.selectByExampleList(example);
    }
    /**
     * @param example
     * @return AuthRoleResource
     * @throws
     * @Title: findByExample
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    @Override
    public AuthRoleResource findByExample(Example example) {
    	List<AuthRoleResource>  authRoleResources=authRoleResourceRepository.selectByExampleList(example);
    	 if (authRoleResources != null && authRoleResources.size() > 0) {
    		 return authRoleResources.get(0);
    	 }else {
    		 return null;
    	 }
    }
    /**
     * @param  id
     * @return AuthRoleResource
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:19
     */
    @Override
    public AuthRoleResource findByPrimaryKey(String id) {
        return authRoleResourceRepository.selectByPrimaryKey(id);
    }
}
