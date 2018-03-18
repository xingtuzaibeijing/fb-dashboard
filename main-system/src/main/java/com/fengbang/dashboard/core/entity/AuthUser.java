package com.fengbang.dashboard.core.entity;

import javax.persistence.*;
import java.util.*;
import lombok.Data;
import com.fengbang.dashboard.core.entity.base.FBEntity;
/**
 * AuthUser
 * @author code-generator
 *
 */
@Data
@Table(name="T_AUTH_USER")
public class AuthUser implements FBEntity{
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 数据ID
	 */
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SELECT SYS_GUID() FROM DUAL ")
	@Column(name = "ID")
	private String id;
	
	/**
	 * 登录名
	 */
	@Column(name = "USERNAME")
	private String username;
	
	/**
	 * 密码
	 */
	@Column(name = "PASSWORD")
	private String password;
	
	/**
	 * 姓
	 */
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	/**
	 * 名
	 */
	@Column(name = "LAST_NAME")
	private String lastName;
	
	/**
	 * 用户手机号
	 */
	@Column(name = "TEL")
	private String tel;
	
	/**
	 * 推荐人手机号
	 */
	@Column(name = "RECOMMENDER_TEL")
	private String recommenderTel;
	
	/**
	 * 姓名
	 */
	@Column(name = "WHOLE_NAME")
	private String wholeName;
	
	/**
	 * 状态
	 */
	@Column(name = "STATUS")
	private String status;
	
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
	 * 身份证号
	 */
	@Column(name = "ID_NO")
	private String idNo;
}