package org.june.controllers;

import java.util.List;

import org.june.model.dto.UsersDTO;
import org.june.model.services.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@Autowired
	private UserinfoService userService;

	@RequestMapping("/hello")
	public String test(Model model) {

//		int i = 5 / 0;
		model.addAttribute("name", "Áõ¿¥");
		return "index";
	}

	@RequestMapping("/getall")
	@ResponseBody
	public List<UsersDTO> getAllUsers() throws Throwable {

		return userService.findAllUsers();
	}

	/**
	 * 
	 * @param dto
	 * @return
	 * @throws Throwable
	 */
	@RequestMapping("/register")
	public String register(@ModelAttribute("user") UsersDTO dto) throws Throwable {

		userService.addUser(dto);

		return "index";
	}

	@RequestMapping(value = "/reg/{name}/{age}")
	public String register2(@PathVariable("name") String name, @PathVariable("age") int age) throws Throwable {
		userService.addUser(new UsersDTO(name, age));
		return "index";
	}
}
