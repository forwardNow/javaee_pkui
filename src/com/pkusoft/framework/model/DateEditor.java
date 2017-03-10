package com.pkusoft.framework.model;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.util.StringUtils;

public class DateEditor extends PropertyEditorSupport {
	private static final String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	private static final String DATETIME_PATTERN_NO_SECOND = "yyyy-MM-dd HH:mm";

	private static final String DATE_PATTERN = "yyyy-MM-dd";

	private static final String MONTH_PATTERN = "yyyy-MM";

	private DateFormat dateFormat;
	private boolean allowEmpty = true;

	public DateEditor() {

	}

	public DateEditor(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public DateEditor(DateFormat dateFormat, boolean allowEmpty) {
		this.dateFormat = dateFormat;
		this.allowEmpty = allowEmpty;
	}

	/**
	 * Parse the Date from the given text, using the specified DateFormat.
	 */
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (this.allowEmpty && !StringUtils.hasText(text)) {
			// Treat empty String as null value.
			setValue(null);
		} else {
			try {

				if (this.dateFormat != null) {
					setValue(this.dateFormat.parse(text));
				} else {
					Date result = DateUtils
							.parseDate((String) text, new String[] {
									DATE_PATTERN, DATETIME_PATTERN,
									DATETIME_PATTERN_NO_SECOND, MONTH_PATTERN });

					// all patterns failed, try a milliseconds constructor
					if (result == null && StringUtils.hasText(text)) {
						result = new Date(new Long((String) text).longValue());
					}

					setValue(result);
				}
			} catch (ParseException ex) {
				throw new IllegalArgumentException("Could not parse date: "
						+ ex.getMessage(), ex);
			}
		}
	}

}
