
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.entity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.*;
import lombok.Data;
import ${basepackage}.entity.base.FBEntity;
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
	<#if column.javaType=="Date">
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	</#if>
	@Column(name = "${column.colNameOld}")
	private ${column.javaType} ${column.columnNameFirstLower};
	</#if>
	</#list>
}