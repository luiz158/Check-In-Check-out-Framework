/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the MIT License (MIT);
 */
package cs525.project.fujframework.core;

import java.sql.ResultSet;

import cs525.project.fujframework.middleware.SysUser;

/**
 * defines a higher level interface for system user related subsystems
 * 
 * @author paudelumesh
 *
 * @version 1.0.0
 */
public interface SysUserFacade {

	/**
	 * saves the system user into database taking the request from command
	 * pattern
	 * 
	 * @param sysUser
	 * @return int
	 */
	public int saveSysUser(SysUser sysUser);

	/**
	 * removes the system user from database taking the request from command
	 * pattern
	 * 
	 * @param sysUser
	 * @return int
	 */
	public int removeSysUser(SysUser sysUser);

	/**
	 * @param tableName
	 * @return resultSet of all system users
	 */
	public ResultSet getAllUsers(Class<?> tableName);
	
	/**
	 * checks if the user exists or not
	 * @param userName
	 * @param password
	 * @return
	 */
	public ResultSet getUserByUserNameAndPassword(String userName,String password,Class<?> userTable);
}
