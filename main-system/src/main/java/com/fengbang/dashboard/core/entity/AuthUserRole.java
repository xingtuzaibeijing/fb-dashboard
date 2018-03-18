package com.fengbang.dashboard.core.entity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.*;
import lombok.Data;
import com.fengbang.dashboard.core.entity.base.FBEntity;
/**
 * AuthUserRole
 * @author code-generator
 *
 */
@Data
@Table(name="T_AUTH_USER_ROLE")
public class AuthUserRole implements FBEntity{
	private static final long serialVersionUID = 1L;
	
	/**
	 * 数据ID
	 */
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SELECT SYS_GUID() FROM DUAL ")
	@Column(name = "ID")
	private String id;
	/**
	 * 用户ID
	 */
	@Column(name = "USER_ID")
	private String userId;
	/**
	 * 角色ID
	 */
	@Column(name = "ROLE_ID")
	private String roleId;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "CREATE_DATE")
	private Date createDate;
}