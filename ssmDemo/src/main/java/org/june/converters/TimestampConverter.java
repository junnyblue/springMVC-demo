package org.june.converters;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class TimestampConverter implements Converter<String, Timestamp> {

	private static final Logger logger = Logger.getLogger(TimestampConverter.class);

	@Override
	public Timestamp convert(String source) {
		logger.info("Convert from string to timestamp");
		Timestamp ts = null;
		if (!StringUtils.isEmpty(source)) {
			try {
				ts = new Timestamp(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(source).getTime());
			} catch (ParseException e) {
				logger.error("´Ó×Ö·û´®µ½Timestamp×ª»»´íÎó", e);
			}
		}

		return ts;
	}

}
