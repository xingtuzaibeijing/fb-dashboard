package com.fengbang.dashboard.core.entity;

import javax.persistence.*;
import java.util.*;
import lombok.Data;
import com.fengbang.dashboard.core.entity.base.FBEntity;
/**
 * AuthClient
 * @author code-generator
 *
 */
@Data
@Table(name="T_AUTH_CLIENT")
public class AuthClient implements FBEntity{
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 数据ID
	 */
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SELECT SYS_GUID() FROM DUAL ")
	@Column(name = "ID")
	private String id;
	
	/**
	 * 客户端标识
	 */
	@Column(name = "CLIENT_ID")
	private String clientId;
	
	/**
	 * 客户端密匙
	 */
	@Column(name = "CLIENT_SECRET")
	private String clientSecret;
	
	/**
	 * 创建人
	 */
	@Column(name = "CREATOR")
	private String creator;
	
	/**
	 * 更新人
	 */
	@Column(name = "UPDATER")
	private String updater;
	
	/**
	 * 创建时间
	 */
	@Column(name = "CREATE_TIME")
	private Date createTime;
	
	/**
	 * 更新时间
	 */
	@Column(name = "UPDATE_TIME")
	private Date updateTime;
	
	/**
	 * 备注
	 */
	@Column(name = "REMARK")
	private String remark;
	
	/**
	 * 范围
	 */
	@Column(name = "SCOPES")
	private String scopes;
	
	/**
	 * 权限类型
	 */
	@Column(name = "AUTHORIZEDGRANTTYPES")
	private String authorizedgranttypes;
	
	/**
	 * 角色
	 */
	@Column(name = "ROLES")
	private String roles;
}