package com.fengbang.genrate.app.template2.fb

<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
<#assign tableNameNew = table.tableNameNew>
<#assign tableNameNewLowerCase = table.tableNameNewLowerCase>
package ${basepackage}.dao;

import ${basepackage}.data.config.BaseDao;
import ${basepackage}.entity.${table.tableNameNew!className};
/**
 * ${table.tableAlias}
 * @author code-generator 
 */
public interface ${tableNameNew!className}Dao extends BaseDao<${tableNameNew!className}> {
}