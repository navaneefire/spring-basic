package com.navanee.spring.navanee.spring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
	public void drive()
	{
		System.out.println("bike");
	}
}
