package com.fengbang.dashboard.core.entity;

import javax.persistence.*;
import java.util.*;
import lombok.Data;
import com.fengbang.dashboard.core.entity.base.FBEntity;
/**
 * AuthRole
 * @author code-generator
 *
 */
@Data
@Table(name="T_AUTH_ROLE")
public class AuthRole implements FBEntity{
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 用户角色ID
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
	 * 创建用户
	 */
	@Column(name = "CREATE_USER")
	private String createUser;
	
	/**
	 * 姓名
	 */
	@Column(name = "NAME")
	private String name;
	
	/**
	 * 修改时间
	 */
	@Column(name = "UPDATE_TIME")
	private Date updateTime;
	
	/**
	 * 修改人员
	 */
	@Column(name = "UPDATE_USER")
	private String updateUser;
	
	/**
	 * 类型
	 */
	@Column(name = "TYPE")
	private Integer type;
	
	/**
	 * 角色编码
	 */
	@Column(name = "ROLE_CODE")
	private String roleCode;
}