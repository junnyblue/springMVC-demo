package org.june.system;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class LogWriter {

	private static final Logger logger = Logger.getLogger(LogWriter.class);

	/**
	 * ������־д��
	 * 
	 * @param e
	 */
	public void writeError(JoinPoint jp, Exception e) {
		logger.error(jp, e);
	}

	/**
	 * д������־
	 * 
	 * @param p
	 * @return
	 * @throws Throwable
	 */
	public Object writeInfo(ProceedingJoinPoint p) throws Throwable {
		Object result = null;
		logger.info(p + "��ʼ����");

		result = p.proceed();

		logger.info(p + "��������");

		return result;
	}

}
