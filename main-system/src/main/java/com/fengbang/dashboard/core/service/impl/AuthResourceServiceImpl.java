package com.fengbang.dashboard.core.service.impl;

import com.fengbang.dashboard.core.repository.AuthResourceRepository;
import com.fengbang.dashboard.core.service.AuthResourceService;
import com.fengbang.dashboard.core.entity.AuthResource;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * AuthResource
 * @author QianHuaSheng
 */
@Component
public class AuthResourceServiceImpl implements AuthResourceService{
	 @Autowired
	 public  AuthResourceRepository authResourceRepository;
	
    /**
     * @param authResource
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
  */
    @Override
    public String  persistSelective(AuthResource authResource){
    	String authResourceId=authResourceRepository.insertOneSelective(authResource);
        return  authResourceId;
    }
    
    /**
     * @param authResource
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    @Override
    public void  freshByPrimaryKey(AuthResource authResource) {
    	authResourceRepository.updateByPrimaryKey(authResource);
    }

    /**
     * @param authResource
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    @Override
    public void freshByPrimaryKeySelective(AuthResource authResource) {
    	authResourceRepository.updateByPrimaryKeySelective(authResource);
    }
   
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
    @Override
    public void freshByExampleSelective(AuthResource authResource, Example example){
    	authResourceRepository.updateByExampleSelective(authResource,example);
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
    	authResourceRepository.delete(id);
    }

    /**
     * @return List<AuthResource>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    @Override
    public List<AuthResource> findAll() {
        return  authResourceRepository.selectAll();
    }
    
    /**
     * @param example
     * @return List<AuthResource>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    @Override
    public List<AuthResource> findByExampleList(Example example) {
        return authResourceRepository.selectByExampleList(example);
    }
    /**
     * @param example
     * @return AuthResource
     * @throws
     * @Title: findByExample
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    @Override
    public AuthResource findByExample(Example example) {
    	List<AuthResource>  authResources=authResourceRepository.selectByExampleList(example);
    	 if (authResources != null && authResources.size() > 0) {
    		 return authResources.get(0);
    	 }else {
    		 return null;
    	 }
    }
    /**
     * @param  id
     * @return AuthResource
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:05
     */
    @Override
    public AuthResource findByPrimaryKey(String id) {
        return authResourceRepository.selectByPrimaryKey(id);
    }
}
