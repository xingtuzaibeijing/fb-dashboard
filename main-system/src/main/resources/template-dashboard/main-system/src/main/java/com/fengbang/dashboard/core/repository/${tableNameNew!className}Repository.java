

<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign tableNameNew = table.tableNameNew>
<#assign tableNameNewLowerCase = table.tableNameNewLowerCase>
package ${basepackage}.repository;
import ${basepackage}.entity.${tableNameNew!className};
import ${basepackage}.util.PageQuery;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * ${table.tableAlias}
 * @author code-generator 
 */
public interface ${tableNameNew!className}Repository {
	/**
	 * 单个实体添加
	 *@param :${tableNameNew!className}
	 *@Return:java.lang.String
	*/
    String insertOne(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower});

    /**
     *动态添加
     *@param: ${tableNameNew!className}
     *@Return:java.lang.String
     */
    String  insertOneSelective(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower});
    
    /**
     *批量保存
     *@param: List<${tableNameNew!className}>
     *@Return:java.util.List<${basepackage}.entity.${tableNameNew!className}>
     */
    List<${tableNameNew!className}> insertList(List<${tableNameNew!className}> ${tableNameNewLowerCase!classNameLower}s);
    
    /**
     *单个修改
     *@param: ${tableNameNew!className}
     *@Return:void
     */
    void updateByPrimaryKey(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower});
   
    /**
     *动态修改
     *@param: ${tableNameNew!className}
     *@Return:void
     */
    void updateByPrimaryKeySelective(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower});
    
    /**
     *根据条件修改
     *@param: ${tableNameNew!className},Example
     *@Return:void
     */
    void updateByExample(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower}, Example example);

    /**
     *根据条件动态修改
     *@param: ${tableNameNew!className},Example
     *@Return:void
     */
    void updateByExampleSelective(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower}, Example example);
    
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
    List<${tableNameNew!className}> selectAll();
    
    /**
     *通过条件单个查询
     *@param: Example
     *@Return:${basepackage}.entity.${tableNameNew!className}
     */
    ${tableNameNew!className} selectByExample(Example example);
    
    /**
     *通过条件批量查询
     *@param: Example
     *@Return:java.util.List<${basepackage}.entity.${tableNameNew!className}>
     */
    List<${tableNameNew!className}> selectByExampleList(Example example);
    
    /**
     *通过ID查询
     *@param: String
     *@Return:${basepackage}.entity.${tableNameNew!className}
     */
    ${tableNameNew!className} selectByPrimaryKey(String id);
        
    /**
     *分页查询
     *@param: PageQuery
     *@Return:void
     */
    void setPageQuery(PageQuery pageQuery);
}
