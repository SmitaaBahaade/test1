package com.javaexpress;

import org.springframework.stereotype.Component;

@Component
public class Car {

	public Car() {
		System.out.println("Car Default Constructor");
	}
	
	public void drive() {
		System.out.println("Car is running");
	}
}
