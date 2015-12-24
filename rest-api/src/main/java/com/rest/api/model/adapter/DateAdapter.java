package com.rest.api.model.adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

	private static final String DATE_FORMAT = "yyyy-MM-dd";
	
	@Override
	public String marshal(Date value) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		return sdf.format(value);
	}

	@Override
	public Date unmarshal(String value) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		return sdf.parse(value);
	}
	
}
