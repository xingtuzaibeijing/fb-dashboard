package com.fengbang.dashboard.core.entity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.*;
import lombok.Data;
import com.fengbang.dashboard.core.entity.base.FBEntity;
/**
 * AuthRoleResource
 * @author code-generator
 *
 */
@Data
@Table(name="T_AUTH_ROLE_RESOURCE")
public class AuthRoleResource implements FBEntity{
	private static final long serialVersionUID = 1L;
	
	/**
	 * 数据ID
	 */
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SELECT SYS_GUID() FROM DUAL ")
	@Column(name = "ID")
	private String id;
	/**
	 * 角色ID
	 */
	@Column(name = "ROLE_ID")
	private String roleId;
	/**
	 * 资源ID
	 */
	@Column(name = "RESOURCE_ID")
	private String resourceId;
	/**
	 * 创建日期
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "CREATE_DATE")
	private Date createDate;
}