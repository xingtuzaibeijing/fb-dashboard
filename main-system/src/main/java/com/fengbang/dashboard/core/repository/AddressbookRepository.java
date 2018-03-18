package com.fengbang.dashboard.core.repository;
import com.fengbang.dashboard.core.entity.Addressbook;
import com.fengbang.dashboard.core.util.PageQuery;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * 通讯录表
 * @author code-generator 
 */
public interface AddressbookRepository {
	/**
	 * 单个实体添加
	 *@param :Addressbook
	 *@Return:java.lang.String
	*/
    String insertOne(Addressbook addressbook);

    /**
     *动态添加
     *@param: Addressbook
     *@Return:java.lang.String
     */
    String  insertOneSelective(Addressbook addressbook);
    
    /**
     *批量保存
     *@param: List<Addressbook>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.Addressbook>
     */
    List<Addressbook> insertList(List<Addressbook> addressbooks);
    
    /**
     *单个修改
     *@param: Addressbook
     *@Return:void
     */
    void updateByPrimaryKey(Addressbook addressbook);
   
    /**
     *动态修改
     *@param: Addressbook
     *@Return:void
     */
    void updateByPrimaryKeySelective(Addressbook addressbook);
    
    /**
     *根据条件修改
     *@param: Addressbook,Example
     *@Return:void
     */
    void updateByExample(Addressbook addressbook, Example example);

    /**
     *根据条件动态修改
     *@param: Addressbook,Example
     *@Return:void
     */
    void updateByExampleSelective(Addressbook addressbook, Example example);
    
    /**
     *根据ID删除
     *@param: String
     *@Return:void
     */
    void delete(String id);
    
    /**
     *全部查询
     *@param:void
     *@Return:java.util.List
     */
    List<Addressbook> selectAll();
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.Addressbook
     */
    Addressbook selectByExample(Example example);
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.Addressbook>
     */
    List<Addressbook> selectByExampleList(Example example);
    
    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.Addressbook
     */
    Addressbook selectByPrimaryKey(String id);
        
    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    void setPageQuery(PageQuery pageQuery);
}
