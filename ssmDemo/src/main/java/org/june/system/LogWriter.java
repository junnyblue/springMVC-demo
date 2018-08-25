package org.june.system;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class LogWriter {

	private static final Logger logger = Logger.getLogger(LogWriter.class);

	/**
	 * 错误日志写法
	 * 
	 * @param e
	 */
	public void writeError(JoinPoint jp, Exception e) {
		logger.error(jp, e);
	}

	/**
	 * 写环绕日志
	 * 
	 * @param p
	 * @return
	 * @throws Throwable
	 */
	public Object writeInfo(ProceedingJoinPoint p) throws Throwable {
		Object result = null;
		logger.info(p + "开始运行");

		result = p.proceed();

		logger.info(p + "结束运行");

		return result;
	}

}
