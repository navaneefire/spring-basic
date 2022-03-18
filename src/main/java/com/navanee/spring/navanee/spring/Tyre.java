package com.navanee.spring.navanee.spring;

import org.springframework.stereotype.Component;


public class Tyre 
{
	String brandName;
	Integer size;
	

	public Tyre(String brandName, Integer size) {
		super();
		this.brandName = brandName;
		this.size = size;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	

	@Override
	public String toString() {
		return "Tyre [brandName=" + brandName + ", size=" + size + "]";
	}
	
}
