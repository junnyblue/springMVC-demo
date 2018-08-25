package org.june.model.dto;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class PageLogger {
	private final Logger logger = Logger.getLogger(PageLogger.class);

	private String level;
	private String message;

	public void setLevel(String level) {
		this.level = level;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PageLogger [level=" + level + ", message=" + message + "]";
	}

	public String getLevel() {
		return level;
	}

	public String getMessage() {
		return message;
	}

	public void writeLog() {
		logger.log(Level.toLevel(level), message);
	}
}
