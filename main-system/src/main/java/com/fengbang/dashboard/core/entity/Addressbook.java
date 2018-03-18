package com.fengbang.dashboard.core.entity;

import javax.persistence.*;
import java.util.*;
import lombok.Data;
import com.fengbang.dashboard.core.entity.base.FBEntity;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 通讯录表
 * @author code-generator
 *
 */
@Data
@Table(name="T_ADDRESSBOOK")
public class Addressbook implements FBEntity{
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 
	 */
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SELECT SYS_GUID() FROM DUAL ")
	@Column(name = "ID")
	private String id;
	
	/**
	 * 手机号
	 */
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	/**
	 * 设备号
	 */
	@Column(name = "EQUIPMENT_NUM")
	private String equipmentNum;
	
	/**
	 * 联系人姓名
	 */
	@Column(name = "NAME")
	private String name;
	
	/**
	 * 昵称
	 */
	@Column(name = "NICKE_NAME")
	private String nickeName;
	
	/**
	 * 生日
	 */
	@Column(name = "BIRTHDAY")
	private String birthday;
	
	/**
	 * 头像
	 */
	@Column(name = "IMAGEDATE")
	private String imagedate;
	
	/**
	 * 职位信息 
	 */
	@Column(name = "JOB_TITLE")
	private String jobTitle;
	
	/**
	 * 部门
	 */
	@Column(name = "DEPARTMENT_NAME")
	private String departmentName;
	
	/**
	 * 公司
	 */
	@Column(name = "ORGANIZATION_NAME")
	private String organizationName;
	
	/**
	 * 
	 */
	@Column(name = "CREATOR")
	private String creator;
	
	/**
	 * 
	 */
	@Column(name = "UPDATER")
	private String updater;
	
	/**
	 * 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "CREATE_TIME")
	private Date createTime;
	
	/**
	 * 
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "UPDATE_TIME")
	private Date updateTime;
	
	/**
	 * 
	 */
	@Column(name = "REMARK")
	private String remark;
}