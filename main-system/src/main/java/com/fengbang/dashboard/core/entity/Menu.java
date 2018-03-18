package com.fengbang.dashboard.core.entity;

import javax.persistence.*;
import java.util.*;

import com.fengbang.dashboard.core.entity.base.FBEntity;
import lombok.Data;

/**
 * Menu
 * @author code-generator
 *
 */
@Data
@Table(name="t_menu")
public class Menu implements FBEntity {
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 资源名称
	 */
	@Column(name = "menu_name")
	private String menuName;
	
	/**
	 * 上级菜单id
	 */
	@Column(name = "menu_superior")
	private String menuSuperior;
	
	/**
	 * 菜单类型
	 */
	@Column(name = "menu_type")
	private String menuType;
	
	/**
	 * 菜单ID
	 */
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select replace(uuid(), '-', '');")
	@Column(name = "menu_id")
	private String id;
	
	/**
	 * 菜单资源
	 */
	@Column(name = "menu_resource")
	private String menuResource;
	
	/**
	 * 排序
	 */
	@Column(name = "menu_rank")
	private Integer menuRank;

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