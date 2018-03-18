package com.fengbang.dashboard.core.service.impl;

import com.fengbang.dashboard.core.repository.AuthClientRepository;
import com.fengbang.dashboard.core.service.AuthClientService;
import com.fengbang.dashboard.core.entity.AuthClient;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * AuthClient
 * @author QianHuaSheng
 */
@Component
public class AuthClientServiceImpl implements AuthClientService{
	 @Autowired
	 public  AuthClientRepository authClientRepository;
	
    /**
     * @param authClient
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
  */
    @Override
    public String  persistSelective(AuthClient authClient){
    	String authClientId=authClientRepository.insertOneSelective(authClient);
        return  authClientId;
    }
    
    /**
     * @param authClient
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    @Override
    public void freshByPrimaryKey(AuthClient authClient) {
    	authClientRepository.updateByPrimaryKey(authClient);
    }

    /**
     * @param authClient
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    @Override
    public void freshByPrimaryKeySelective(AuthClient authClient) {
    	authClientRepository.updateByPrimaryKeySelective(authClient);
    }
   
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
    @Override
    public void freshByExampleSelective(AuthClient authClient, Example example){
    	authClientRepository.updateByExampleSelective(authClient,example);
    }
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    @Override
    public void erase(String id) {
    	authClientRepository.delete(id);
    }

    /**
     * @return List<AuthClient>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    @Override
    public List<AuthClient> findAll() {
        return  authClientRepository.selectAll();
    }
    
    /**
     * @param example
     * @return List<AuthClient>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    @Override
    public List<AuthClient> findByExampleList(Example example) {
        return authClientRepository.selectByExampleList(example);
    }
    /**
     * @param example
     * @return AuthClient
     * @throws
     * @Title: findByExample
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    @Override
    public AuthClient findByExample(Example example) {
    	List<AuthClient>  authClients=authClientRepository.selectByExampleList(example);
    	 if (authClients != null && authClients.size() > 0) {
    		 return authClients.get(0);
    	 }else {
    		 return null;
    	 }
    }
    /**
     * @param  id
     * @return AuthClient
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:04
     */
    @Override
    public AuthClient findByPrimaryKey(String id) {
        return authClientRepository.selectByPrimaryKey(id);
    }
}
