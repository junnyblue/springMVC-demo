package org.june.model.dao;

import java.util.List;

import org.june.model.entity.Users;
import org.springframework.stereotype.Repository;

public interface IUsersDao {

	/**
	 * �����û�
	 * 
	 * @param user
	 * @return
	 * @throws Throwable
	 */
	public int insertUser(Users user) throws Throwable;

	/**
	 * ��ѯ�����û���Ϣ
	 * 
	 * @return
	 * @throws Throwable
	 */
	public List<Users> findAllUsers() throws Throwable;
	
	/**
	 * ��̬��ѯ
	 * @param ex
	 * @return
	 */
	public List<Users> findUserByExample(Users ex);

}
