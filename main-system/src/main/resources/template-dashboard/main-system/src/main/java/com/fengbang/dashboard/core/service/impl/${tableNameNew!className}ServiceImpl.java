<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign tableNameNew = table.tableNameNew>
<#assign tableNameNewLowerCase = table.tableNameNewLowerCase>
<#assign date = table.nowDate>
package ${basepackage}.service.impl;

import ${basepackage}.repository.${tableNameNew!className}Repository;
import ${basepackage}.service.${tableNameNew!className}Service;
import ${basepackage}.entity.${tableNameNew!className};
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * ${tableNameNew!className}
 * @author code-generator
 */
@Component
public class ${tableNameNew!className}ServiceImpl implements ${tableNameNew!className}Service{
	 @Autowired
	 public  ${tableNameNew!className}Repository ${tableNameNewLowerCase!classNameLower}Repository;
	
    /**
     * @param ${tableNameNewLowerCase!classNameLower}
     * @return String
     * @throws
     * @Title: persistSelective
     * @Description: 动态添加
     * @author code-generator
     * @date ${date}
  */
    @Override
    public String  persistSelective(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower}){
    	String ${tableNameNewLowerCase!classNameLower}Id=${tableNameNewLowerCase!classNameLower}Repository.insertOneSelective(${tableNameNewLowerCase!classNameLower});
        return  ${tableNameNewLowerCase!classNameLower}Id;
    }
    
    /**
     * @param ${tableNameNewLowerCase!classNameLower}
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 根据id修改
     * @author code-generator
     * @date ${date}
     */
    @Override
    public void freshByPrimaryKey(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower}) {
    	${tableNameNewLowerCase!classNameLower}Repository.updateByPrimaryKey(${tableNameNewLowerCase!classNameLower});
    }

    /**
     * @param ${tableNameNewLowerCase!classNameLower}
     * @return void
     * @throws
     * @Title: freshByPrimaryKey
     * @Description: 动态修改
     * @author code-generator
     * @date ${date}
     */
    @Override
    public void freshByPrimaryKeySelective(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower}) {
    	${tableNameNewLowerCase!classNameLower}Repository.updateByPrimaryKeySelective(${tableNameNewLowerCase!classNameLower});
    }
   
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
    @Override
    public void freshByExampleSelective(${tableNameNew!className} ${tableNameNewLowerCase!classNameLower}, Example example){
    	${tableNameNewLowerCase!classNameLower}Repository.updateByExampleSelective(${tableNameNewLowerCase!classNameLower},example);
    }
    
    /**
     * @param id
     * @return void
     * @throws
     * @Title: erase
     * @Description: 根据ID修改
     * @author code-generator
     * @date ${date}
     */
    @Override
    public void erase(String id) {
    	${tableNameNewLowerCase!classNameLower}Repository.delete(id);
    }

    /**
     * @return List<${tableNameNew!className}>
     * @throws
     * @Title: findAll
     * @Description: 全部查询
     * @author code-generator
     * @date ${date}
     */
    @Override
    public List<${tableNameNew!className}> findAll() {
        return  ${tableNameNewLowerCase!classNameLower}Repository.selectAll();
    }
    
    /**
     * @param example
     * @return List<${tableNameNew!className}>
     * @throws
     * @Title: findByExampleList
     * @Description: 通过条件批量查询
     * @author code-generator
     * @date ${date}
     */
    @Override
    public List<${tableNameNew!className}> findByExampleList(Example example) {
        return ${tableNameNewLowerCase!classNameLower}Repository.selectByExampleList(example);
    }
    /**
     * @param example
     * @return ${tableNameNew!className}
     * @throws
     * @Title: findByExample
     * @Description: 通过条件查询
     * @author code-generator
     * @date ${date}
     */
    @Override
    public ${tableNameNew!className} findByExample(Example example) {
    	List<${tableNameNew!className}>  ${tableNameNewLowerCase!classNameLower}s=${tableNameNewLowerCase!classNameLower}Repository.selectByExampleList(example);
    	 if (${tableNameNewLowerCase!classNameLower}s != null && ${tableNameNewLowerCase!classNameLower}s.size() > 0) {
    		 return ${tableNameNewLowerCase!classNameLower}s.get(0);
    	 }else {
    		 return null;
    	 }
    }
    /**
     * @param  id
     * @return ${tableNameNew!className}
     * @throws
     * @Title: findByPrimaryKey
     * @Description: 通过ID查询
     * @author code-generator
     * @date ${date}
     */
    @Override
    public ${tableNameNew!className} findByPrimaryKey(String id) {
        return ${tableNameNewLowerCase!classNameLower}Repository.selectByPrimaryKey(id);
    }
}
