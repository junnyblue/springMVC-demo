package org.june.system;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 统一异常处理器
 * 
 * @author Administrator
 *
 */
@Component
public class GlobalExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		String message = ex.getMessage();
		ModelAndView mv = new ModelAndView();
		mv.addObject("errorMsg", message);
		mv.setViewName("globalError");
		return mv;
	}

}
