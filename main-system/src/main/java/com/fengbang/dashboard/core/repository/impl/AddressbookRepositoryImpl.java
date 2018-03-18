package com.fengbang.dashboard.core.repository.impl;
import com.fengbang.dashboard.core.config.TargetDataSource;


import com.fengbang.dashboard.core.dao.AddressbookDao;
import com.fengbang.dashboard.core.repository.AddressbookRepository;
import com.fengbang.dashboard.core.repository.base.AbstractBaseRepository;
import com.fengbang.dashboard.core.entity.Addressbook;
import com.fengbang.dashboard.core.util.PageQuery;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * 通讯录表
 * @author code-generator
 */
@Component
public class AddressbookRepositoryImpl extends AbstractBaseRepository<AddressbookDao, Addressbook> implements AddressbookRepository {
	/**
	 * 单个实体添加
	 *@param :Addressbook
	 *@Return:java.lang.String
	*/
    @Override
    @TargetDataSource(name="ds1")
    public String insertOne(Addressbook addressbook) {
        super.insert(addressbook);
        return addressbook.getId();
    }

    /**
     *动态添加
     *@param: Addressbook
     *@Return:java.lang.String
     */
    @TargetDataSource(name="ds1")
    @Override
    public String  insertOneSelective(Addressbook addressbook){
        super.insertSelective(addressbook);
        return  addressbook.getId();
    }

    /**
     *批量保存
     *@param: List<Addressbook>
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.Addressbook>
     */
    @TargetDataSource(name="ds1")
    @Override
    public List<Addressbook> insertList(List<Addressbook> addressbooks){
        super.insertListByMapper(addressbooks);
        return addressbooks;
    }

    /**
     *单个修改
     *@param: Addressbook
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void updateByPrimaryKey(Addressbook addressbook) {
        super.updateByPrimaryKey(addressbook);
    }

    /**
     *动态修改
     *@param: Addressbook
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void updateByPrimaryKeySelective(Addressbook addressbook) {
        super.updateByPrimaryKeySelective(addressbook);
    }

    /**
     *根据条件修改
     *@param: Addressbook,Example
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void updateByExample(Addressbook addressbook, Example example ) {
        super.updateByExample(addressbook,example);
    }

    /**
     *根据条件动态修改
     *@param: Addressbook,Example
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void updateByExampleSelective(Addressbook addressbook, Example example){
        super.updateByExampleSelective(addressbook,example);
    }

    /**
     *根据ID删除
     *@param: String
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void delete(String id) {
        super.delete(id);
    }

    /**
     *全部查询
     *@param:void
     *@Return:java.util.List
     */
    @TargetDataSource(name="ds1")
    @Override
    public List<Addressbook> selectAll() {
        return  super.selectAll();
    }

    /**
     *通过条件单个查询
     *@param: Example
     *@Return:com.fengbang.dashboard.core.entity.Addressbook
     */
    @TargetDataSource(name="ds1")
    @Override
    public Addressbook selectByExample(Example example) {
        return  super.selectOneByExample(example);
    }

    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<com.fengbang.dashboard.core.entity.Addressbook>
     */
    @TargetDataSource(name="ds1")
    @Override
    public List<Addressbook> selectByExampleList(Example example) {
        return super.selectListByExample(example);
    }

    /**
     *通过ID查询
     *@param: String
     *@Return:com.fengbang.dashboard.core.entity.Addressbook
     */
    @TargetDataSource(name="ds1")
    @Override
    public Addressbook selectByPrimaryKey(String id) {
        return super.selectByPrimaryKey(id);
    }

    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    @TargetDataSource(name="ds1")
    @Override
    public void setPageQuery(PageQuery pageQuery) {
        super.setPageQuery(pageQuery);
    }
}
