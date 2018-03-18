package com.fengbang.dashboard.core.service.impl;

import com.fengbang.dashboard.core.repository.AddressbookRepository;
import com.fengbang.dashboard.core.service.AddressbookService;
import com.fengbang.dashboard.core.entity.Addressbook;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Addressbook
 * @author code-generator
 */
@Component
public class AddressbookServiceImpl implements AddressbookService{
	 @Autowired
	 public  AddressbookRepository addressbookRepository;
	
    /**
     * @param addressbook
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author code-generator
     * @date 2018-02-27 10:58:36
  */
    @Override
    public String  persistSelective(Addressbook addressbook){
    	String addressbookId=addressbookRepository.insertOneSelective(addressbook);
        return  addressbookId;
    }
    
    /**
     * @param addressbook
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    @Override
    public void freshByPrimaryKey(Addressbook addressbook) {
    	addressbookRepository.updateByPrimaryKey(addressbook);
    }

    /**
     * @param addressbook
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    @Override
    public void freshByPrimaryKeySelective(Addressbook addressbook) {
    	addressbookRepository.updateByPrimaryKeySelective(addressbook);
    }
   
    /**
     * @param addressbook
     * @param example
     * @return void
     * @throws
     * @Title: freshByExampleSelective
     * @Description: 根据条件动态修改
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    @Override
    public void freshByExampleSelective(Addressbook addressbook, Example example){
    	addressbookRepository.updateByExampleSelective(addressbook,example);
    }
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    @Override
    public void erase(String id) {
    	addressbookRepository.delete(id);
    }

    /**
     * @return List<Addressbook>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    @Override
    public List<Addressbook> findAll() {
        return  addressbookRepository.selectAll();
    }
    
    /**
     * @param example
     * @return List<Addressbook>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    @Override
    public List<Addressbook> findByExampleList(Example example) {
        return addressbookRepository.selectByExampleList(example);
    }
    /**
     * @param example
     * @return Addressbook
     * @throws
     * @Title: findByExample
     * @Description: 通过条件查询
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    @Override
    public Addressbook findByExample(Example example) {
    	List<Addressbook>  addressbooks=addressbookRepository.selectByExampleList(example);
    	 if (addressbooks != null && addressbooks.size() > 0) {
    		 return addressbooks.get(0);
    	 }else {
    		 return null;
    	 }
    }
    /**
     * @param  id
     * @return Addressbook
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    @Override
    public Addressbook findByPrimaryKey(String id) {
        return addressbookRepository.selectByPrimaryKey(id);
    }
}
