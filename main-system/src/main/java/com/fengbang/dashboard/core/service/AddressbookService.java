package com.fengbang.dashboard.core.service;

import com.fengbang.dashboard.core.entity.Addressbook;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * Addressbook
 * @author code-generator 
 */
public interface AddressbookService {

    /**
     * @param addressbook
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author code-generator
     * @date 2018-02-27 10:58:36
  */
    String  persistSelective(Addressbook addressbook);

    /**
     * @param addressbook
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    void freshByPrimaryKey(Addressbook addressbook);
   
    /**
     * @param addressbook
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    void freshByPrimaryKeySelective(Addressbook addressbook);
    

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
    void freshByExampleSelective(Addressbook addressbook, Example example);
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    void erase(String id);
    
    /**
     * @return List<Addressbook>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    List<Addressbook> findAll();
    
    
    /**
     * @param example
     * @return List<Addressbook>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    List<Addressbook> findByExampleList(Example example);
    
    /**
     * @param example
     * @return Addressbook
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件查询
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    Addressbook findByExample(Example example);
    
    /**
     * @param  id
     * @return Addressbook
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author code-generator
     * @date 2018-02-27 10:58:36
     */
    Addressbook findByPrimaryKey(String id);
    
  
}
