package com.fengbang.genrate.app.template2.fb

<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.entity;

import javax.persistence.*;
import java.util.*;
import lombok.Data;
import com.fengbang.microservice.entity.base.FBEntity;
/**
 * ${table.tableAlias}
 * @author code-generator
 *
 */
@Data
@Table(name="${table.sqlName}")
public class ${table.tableNameNew!className} implements FBEntity{
	private static final long serialVersionUID = 1L;
	
	<#list table.columns as column>
	
	<#if column.isPk>
	/**
	 * ${column.remarks}
	 */
	@Id   
	<#if column.javaType=="String">
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SELECT SYS_GUID() FROM DUAL ")
	<#else>
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SELECT ${table.sqlName}SEQ.NEXTVAL FROM DUAL ")
	</#if>
	@Column(name = "${column.colNameOld}")
	private String id;
	<#else>
	/**
	 * ${column.remarks}
	 */
	@Column(name = "${column.colNameOld}")
	private ${column.javaType} ${column.columnNameFirstLower};
	</#if>
	</#list>
}