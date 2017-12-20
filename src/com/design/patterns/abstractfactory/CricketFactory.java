package com.design.patterns.abstractfactory;

public class CricketFactory implements StudentAbstractFactory{

	private String rollNumber;
	private String name;
	private String className;
	
	public CricketFactory(String rollNumber, String name, String className) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.className = className;
	}

	@Override
	public Student getPlayer() {
		return new Cricket(rollNumber, name, className);
	}
}
