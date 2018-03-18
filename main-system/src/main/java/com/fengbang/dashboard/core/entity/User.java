package com.fengbang.dashboard.core.entity;

import javax.persistence.*;
import java.util.*;
import lombok.Data;
import com.fengbang.dashboard.core.entity.base.FBEntity;
/**
 * User
 * @author code-generator
 *
 */
@Data
@Table(name="t_user")
public class User implements FBEntity{
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 
	 */
	@Column(name = "name")
	private String name;
	
	/**
	 * 
	 */
	@Column(name = "pwd")
	private String pwd;
	
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select replace(uuid(), '-', '');")
	@Column(name = "id")
	private String id;
}