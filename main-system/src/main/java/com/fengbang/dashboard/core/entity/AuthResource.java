package com.fengbang.dashboard.core.entity;

import javax.persistence.*;
import java.util.*;
import lombok.Data;
import com.fengbang.dashboard.core.entity.base.FBEntity;
/**
 * AuthResource
 * @author code-generator
 *
 */
@Data
@Table(name="T_AUTH_RESOURCE")
public class AuthResource implements FBEntity{
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 数据ID
	 */
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SELECT SYS_GUID() FROM DUAL ")
	@Column(name = "ID")
	private String id;
	
	/**
	 * 创建时间
	 */
	@Column(name = "CREATE_TIME")
	private Date createTime;
	
	/**
	 * 创建人
	 */
	@Column(name = "CREATE_USER")
	private String createUser;
	
	/**
	 * 描述
	 */
	@Column(name = "DESCRIPTION")
	private String description;
	
	/**
	 * 图标
	 */
	@Column(name = "ICON")
	private String icon;
	
	/**
	 * 名称
	 */
	@Column(name = "NAME")
	private String name;
	
	/**
	 * 父ID
	 */
	@Column(name = "PARENT_ID")
	private Integer parentId;
	
	/**
	 * 资源URL
	 */
	@Column(name = "RES")
	private String res;
	
	/**
	 * 分类
	 */
	@Column(name = "SORT")
	private Integer sort;
	
	/**
	 * 系统类型
	 */
	@Column(name = "TYPE")
	private Integer type;
	
	/**
	 * 更新时间
	 */
	@Column(name = "UPDATE_TIME")
	private Date updateTime;
	
	/**
	 * 更新人
	 */
	@Column(name = "UPDATE_USER")
	private String updateUser;
}