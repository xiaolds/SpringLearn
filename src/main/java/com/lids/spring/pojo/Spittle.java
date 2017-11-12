package com.lids.spring.pojo;

import  org.apache.commons.lang3.builder.HashCodeBuilder;
import  org.apache.commons.lang3.builder.EqualsBuilder;
import java.util.Date;

public class Spittle {
	
	private final Long id;
	private final String message;
	private final Date time;
	private Double latitude;
	private Double longtitude;
	
	
	public Spittle(String message, Date time) {
		this(message, time ,null, null);
	}

	public Spittle(String message, Date time, Double latitude, Double longtitude) {
		super();
		this.id = null;
		this.message = message;
		this.time = time;
		this.latitude = latitude;
		this.longtitude = longtitude;
	}

	/**** getter && setter ****/
	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(Double longtitude) {
		this.longtitude = longtitude;
	}

	public Long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Date getTime() {
		return time;
	}

	/**** hashCode && equels ****/
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "id", "time");
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj, "id", "time");
	}
	
}
