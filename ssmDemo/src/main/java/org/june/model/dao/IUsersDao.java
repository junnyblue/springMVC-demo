package org.june.model.dao;

import java.util.List;

import org.june.model.entity.Users;
import org.springframework.stereotype.Repository;

public interface IUsersDao {

	/**
	 * 插入用户
	 * 
	 * @param user
	 * @return
	 * @throws Throwable
	 */
	public int insertUser(Users user) throws Throwable;

	/**
	 * 查询所有用户信息
	 * 
	 * @return
	 * @throws Throwable
	 */
	public List<Users> findAllUsers() throws Throwable;
	
	/**
	 * 动态查询
	 * @param ex
	 * @return
	 */
	public List<Users> findUserByExample(Users ex);

}
