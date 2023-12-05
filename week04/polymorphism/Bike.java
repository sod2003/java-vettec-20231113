package com.skillstorm.polymorphism;

public class Bike implements Vehicle/* TODO 3 make Bike a vehicle */ {
	private String color;
	private int numGears;

	@Override
	public void go() {
		System.out.println("Bike is going");

	}
}
