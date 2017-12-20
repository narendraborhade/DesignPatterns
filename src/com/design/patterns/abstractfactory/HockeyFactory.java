package com.design.patterns.abstractfactory;

public class HockeyFactory implements StudentAbstractFactory{

	private String rollNumber;
	private String name;
	private String className;
	
	public HockeyFactory(String rollNumber, String name, String className) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.className = className;
	}

	@Override
	public Student getPlayer() {
		return new Hockey(rollNumber, name, className);
	}
}
