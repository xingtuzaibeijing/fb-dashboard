package com.fengbang.dashboard.core.entity;

import javax.persistence.*;
import java.util.*;
import lombok.Data;
import com.fengbang.dashboard.core.entity.base.FBEntity;
/**
 * AuthUserSysId
 * @author code-generator
 *
 */
@Data
@Table(name="T_AUTH_USER_SYS_ID")
public class AuthUserSysId implements FBEntity{
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 数据ID
	 */
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SELECT SYS_GUID() FROM DUAL ")
	@Column(name = "ID")
	private String id;
	
	/**
	 * 权限用户ID
	 */
	@Column(name = "AUTH_USER_ID")
	private String authUserId;
	
	/**
	 * 系统账号ID
	 */
	@Column(name = "SYS_USER_ID")
	private String sysUserId;
	
	/**
	 * 系统类型
	 */
	@Column(name = "TYPE")
	private Integer type;
	
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
}