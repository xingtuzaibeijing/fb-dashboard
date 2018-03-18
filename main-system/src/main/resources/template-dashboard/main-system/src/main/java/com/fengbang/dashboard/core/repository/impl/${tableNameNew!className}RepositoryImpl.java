<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign tableNameNew = table.tableNameNew>
<#assign dbType = table.dbType>
<#assign tableNameNewLowerCase = table.tableNameNewLowerCase>
package ${basepackage}.repository.impl;

import ${basepackage}.config.TargetDataSource;
import ${basepackage}.dao.${tableNameNew!className}Dao;
import ${basepackage}.repository.${tableNameNew!className}Repository;
import ${basepackage}.repository.base.AbstractBaseRepository;
import ${basepackage}.entity.${tableNameNew!className};
import ${basepackage}.util.PageQuery;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * ${table.tableAlias}
 * @author code-generator
 */
@Component
public class ${tableNameNew!className}RepositoryImpl extends AbstractBaseRepository<${tableNameNew!className}Dao, ${tableNameNew!className}> implements ${tableNameNew!className}Repository {
	/**
	 * 单个实体添加
	 *@param :${tableNameNew!className}
	 *@Return:java.lang.String
	*/
    @Override
    <#if dbType=="oracle">
    @TargetDataSource(name="ds1")
    </#if>
    public String insertOne(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower}) {
        super.insert(${tableNameNewLowerCase!classNameLower});
        return ${tableNameNewLowerCase!classNameLower}.getId();
    }

    /**
     *动态添加
     *@param: ${tableNameNew!className}
     *@Return:java.lang.String
     */
    <#if dbType=="oracle">
    @TargetDataSource(name="ds1")
    </#if>
    @Override
    public String  insertOneSelective(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower}){
        super.insertSelective(${tableNameNewLowerCase!classNameLower});
        return  ${tableNameNewLowerCase!classNameLower}.getId();
    }

    /**
     *批量保存
     *@param: List<${tableNameNew!className}>
     *@Return:java.util.List<${basepackage}.entity.${tableNameNew!className}>
     */
    <#if dbType=="oracle">
    @TargetDataSource(name="ds1")
    </#if>
    @Override
    public List<${tableNameNew!className}> insertList(List<${tableNameNew!className}> ${tableNameNewLowerCase!classNameLower}s){
        super.insertListByMapper(${tableNameNewLowerCase!classNameLower}s);
        return ${tableNameNewLowerCase!classNameLower}s;
    }

    /**
     *单个修改
     *@param: ${tableNameNew!className}
     *@Return:void
     */
    <#if dbType=="oracle">
    @TargetDataSource(name="ds1")
    </#if>
    @Override
    public void updateByPrimaryKey(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower}) {
        super.updateByPrimaryKey(${tableNameNewLowerCase!classNameLower});
    }

    /**
     *动态修改
     *@param: ${tableNameNew!className}
     *@Return:void
     */
    <#if dbType=="oracle">
    @TargetDataSource(name="ds1")
    </#if>
    @Override
    public void updateByPrimaryKeySelective(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower}) {
        super.updateByPrimaryKeySelective(${tableNameNewLowerCase!classNameLower});
    }

    /**
     *根据条件修改
     *@param: ${tableNameNew!className},Example
     *@Return:void
     */
    <#if dbType=="oracle">
    @TargetDataSource(name="ds1")
    </#if>
    @Override
    public void updateByExample(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower}, Example example ) {
        super.updateByExample(${tableNameNewLowerCase!classNameLower},example);
    }

    /**
     *根据条件动态修改
     *@param: ${tableNameNew!className},Example
     *@Return:void
     */
    <#if dbType=="oracle">
    @TargetDataSource(name="ds1")
    </#if>
    @Override
    public void updateByExampleSelective(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower}, Example example){
        super.updateByExampleSelective(${tableNameNewLowerCase!classNameLower},example);
    }

    /**
     *根据ID删除
     *@param: String
     *@Return:void
     */
    <#if dbType=="oracle">
    @TargetDataSource(name="ds1")
    </#if>
    @Override
    public void delete(String id) {
        super.delete(id);
    }

    /**
     *全部查询
     *@param:void
     *@Return:java.util.List
     */
    <#if dbType=="oracle">
    @TargetDataSource(name="ds1")
    </#if>
    @Override
    public List<${tableNameNew!className}> selectAll() {
        return  super.selectAll();
    }

    /**
     *通过条件单个查询
     *@param: Example
     *@Return:${basepackage}.entity.${tableNameNew!className}
     */
    <#if dbType=="oracle">
    @TargetDataSource(name="ds1")
    </#if>
    @Override
    public ${tableNameNew!className} selectByExample(Example example) {
        return  super.selectOneByExample(example);
    }

    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<${basepackage}.entity.${tableNameNew!className}>
     */
    <#if dbType=="oracle">
    @TargetDataSource(name="ds1")
    </#if>
    @Override
    public List<${tableNameNew!className}> selectByExampleList(Example example) {
        return super.selectListByExample(example);
    }

    /**
     *通过ID查询
     *@param: String
     *@Return:${basepackage}.entity.${tableNameNew!className}
     */
    <#if dbType=="oracle">
    @TargetDataSource(name="ds1")
    </#if>
    @Override
    public ${tableNameNew!className} selectByPrimaryKey(String id) {
        return super.selectByPrimaryKey(id);
    }

    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    <#if dbType=="oracle">
    @TargetDataSource(name="ds1")
    </#if>
    @Override
    public void setPageQuery(PageQuery pageQuery) {
        super.setPageQuery(pageQuery);
    }
}
