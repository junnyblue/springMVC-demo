package org.june.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.june.model.dto.UsersDTO;
import org.june.model.services.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class UserController {

	private static final Logger logger = Logger.getLogger(UserController.class);
	@Autowired
	private UserinfoService userService;

	@ResponseBody
	@RequestMapping("/findusers")
	public PageInfo<UsersDTO> findUser(UsersDTO dto, int pageNo, int pageSize) {
		logger.debug("pageNo - " + pageNo);
		logger.debug("pageSize - " + pageSize);
		PageHelper.startPage(pageNo, pageSize);
		List<UsersDTO> list = userService.findUsers(dto);
		return new PageInfo<>(list);
	}

	@ResponseBody
	@RequestMapping("/json1")
	public String json() {
		System.out.println("JSON1 running");
		return "OK";
	}

	@ResponseBody
	@RequestMapping("/json2")
	public UsersDTO json2() {

		return new UsersDTO("liujun", 22);
	}
}
