package org.june.controllers;

import org.june.model.dto.PageLogger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageLoggerController {

	@ResponseBody
	@RequestMapping("/logwriter")
	public void writeLogger(PageLogger logger) {
//		System.out.println(logger);
		logger.writeLog();
	}
}
