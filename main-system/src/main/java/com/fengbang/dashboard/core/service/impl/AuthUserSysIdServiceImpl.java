package com.fengbang.dashboard.core.service.impl;

import com.fengbang.dashboard.core.repository.AuthUserSysIdRepository;
import com.fengbang.dashboard.core.service.AuthUserSysIdService;
import com.fengbang.dashboard.core.entity.AuthUserSysId;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * AuthUserSysId
 * @author QianHuaSheng
 */
@Component
public class AuthUserSysIdServiceImpl implements AuthUserSysIdService{
	 @Autowired
	 public  AuthUserSysIdRepository authUserSysIdRepository;
	
    /**
     * @param authUserSysId
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
  */
    @Override
    public String  persistSelective(AuthUserSysId authUserSysId){
    	String authUserSysIdId=authUserSysIdRepository.insertOneSelective(authUserSysId);
        return  authUserSysIdId;
    }
    
    /**
     * @param authUserSysId
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    @Override
    public void freshByPrimaryKey(AuthUserSysId authUserSysId) {
    	authUserSysIdRepository.updateByPrimaryKey(authUserSysId);
    }

    /**
     * @param authUserSysId
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    @Override
    public void freshByPrimaryKeySelective(AuthUserSysId authUserSysId) {
    	authUserSysIdRepository.updateByPrimaryKeySelective(authUserSysId);
    }
   
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
    @Override
    public void freshByExampleSelective(AuthUserSysId authUserSysId, Example example){
    	authUserSysIdRepository.updateByExampleSelective(authUserSysId,example);
    }
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    @Override
    public void erase(String id) {
    	authUserSysIdRepository.delete(id);
    }

    /**
     * @return List<AuthUserSysId>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    @Override
    public List<AuthUserSysId> findAll() {
        return  authUserSysIdRepository.selectAll();
    }
    
    /**
     * @param example
     * @return List<AuthUserSysId>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    @Override
    public List<AuthUserSysId> findByExampleList(Example example) {
        return authUserSysIdRepository.selectByExampleList(example);
    }
    /**
     * @param example
     * @return AuthUserSysId
     * @throws
     * @Title: findByExample
     * @Description: 通过条件查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    @Override
    public AuthUserSysId findByExample(Example example) {
    	List<AuthUserSysId>  authUserSysIds=authUserSysIdRepository.selectByExampleList(example);
    	 if (authUserSysIds != null && authUserSysIds.size() > 0) {
    		 return authUserSysIds.get(0);
    	 }else {
    		 return null;
    	 }
    }
    /**
     * @param  id
     * @return AuthUserSysId
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author QianHuaSheng
     * @date 2018-01-18 10:49:52
     */
    @Override
    public AuthUserSysId findByPrimaryKey(String id) {
        return authUserSysIdRepository.selectByPrimaryKey(id);
    }
}
