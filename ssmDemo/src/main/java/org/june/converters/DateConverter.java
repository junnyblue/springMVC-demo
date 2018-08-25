package org.june.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class DateConverter implements Converter<String, Date> {

	private static final Logger logger = Logger.getLogger(DateConverter.class);
	private static final SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public Date convert(String str) {
		logger.info("convert from String to Date...");
		Date date = null;
		if (!StringUtils.isEmpty(str)) {
			try {
				date = formater.parse(str);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return date;
	}

}
