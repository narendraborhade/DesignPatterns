package com.design.patterns.abstractfactory;

public class FootBallFactory implements StudentAbstractFactory{

	private String rollNumber;
	private String name;
	private String className;
	
	public FootBallFactory(String rollNumber, String name, String className) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.className = className;
	}

	@Override
	public Student getPlayer() {
		return new FootBall(rollNumber, name, className);
	}

}
