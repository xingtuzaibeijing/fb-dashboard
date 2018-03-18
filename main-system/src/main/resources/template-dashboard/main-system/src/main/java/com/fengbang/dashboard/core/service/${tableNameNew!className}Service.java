<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign tableNameNew = table.tableNameNew>
<#assign tableNameNewLowerCase = table.tableNameNewLowerCase>
<#assign date = table.nowDate>
package ${basepackage}.service;

import ${basepackage}.entity.${tableNameNew!className};
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * ${tableNameNew!className}
 * @author code-generator 
 */
public interface ${tableNameNew!className}Service {

    /**
     * @param ${tableNameNewLowerCase!classNameLower}
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author code-generator
     * @date ${date}
  */
    String  persistSelective(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower});

    /**
     * @param ${tableNameNewLowerCase!classNameLower}
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author code-generator
     * @date ${date}
     */
    void freshByPrimaryKey(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower});
   
    /**
     * @param ${tableNameNewLowerCase!classNameLower}
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author code-generator
     * @date ${date}
     */
    void freshByPrimaryKeySelective(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower});
    

    /**
     * @param ${tableNameNewLowerCase!classNameLower}
     * @param example
     * @return void
     * @throws
     * @Title: freshByExampleSelective
     * @Description: 根据条件动态修改
     * @author code-generator
     * @date ${date}
     */
    void freshByExampleSelective(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower}, Example example);
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author code-generator
     * @date ${date}
     */
    void erase(String id);
    
    /**
     * @return List<${tableNameNew!className}>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author code-generator
     * @date ${date}
     */
    List<${tableNameNew!className}> findAll();
    
    
    /**
     * @param example
     * @return List<${tableNameNew!className}>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author code-generator
     * @date ${date}
     */
    List<${tableNameNew!className}> findByExampleList(Example example);
    
    /**
     * @param example
     * @return ${tableNameNew!className}
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件查询
     * @author code-generator
     * @date ${date}
     */
    ${tableNameNew!className} findByExample(Example example);
    
    /**
     * @param  id
     * @return ${tableNameNew!className}
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author code-generator
     * @date ${date}
     */
    ${tableNameNew!className} findByPrimaryKey(String id);
    
  
}
