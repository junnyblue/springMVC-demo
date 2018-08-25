package org.june.model.services;

import java.util.ArrayList;
import java.util.List;

import org.june.model.dao.IUsersDao;
import org.june.model.dto.UsersDTO;
import org.june.model.entity.Users;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoService {

	@Autowired
	private IUsersDao userDao;

	public List<UsersDTO> findUsers(UsersDTO dto) {
		List<UsersDTO> result = null;
		Users ex = new Users();
		BeanUtils.copyProperties(dto, ex);
		List<Users> list = userDao.findUserByExample(ex);
		if (null != list && !list.isEmpty()) {
			result = new ArrayList<>();
			for (Users users : list) {
				dto = new UsersDTO();
				BeanUtils.copyProperties(users, dto);
				result.add(dto);
			}
		}
		return result;
	}

	public List<UsersDTO> findAllUsers() throws Throwable {
		List<UsersDTO> result = new ArrayList<>();
		List<Users> users = userDao.findAllUsers();
		if (null != users && !users.isEmpty()) {
			for (Users user : users) {
				UsersDTO dto = new UsersDTO();
				BeanUtils.copyProperties(user, dto);
				result.add(dto);
			}
		}

		return result;
	}

	/**
	 * ÃÌº””√ªß
	 * 
	 * @param dto
	 * @throws Throwable
	 */
	public void addUser(UsersDTO dto) throws Throwable {
		Users user = new Users();
		BeanUtils.copyProperties(dto, user);
		userDao.insertUser(user);
	}
}
