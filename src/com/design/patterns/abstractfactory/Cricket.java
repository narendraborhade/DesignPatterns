package com.design.patterns.abstractfactory;

public class Cricket extends Student{

	private String rollNumber;
	private String name;
	private String className;
	
	public Cricket(String rollNumber, String name, String className) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.className = className;
	}
	
	@Override
	public String getStudentRollNumber() {
		return this.rollNumber;
	}
	
	@Override
	public String getStudentName() {
		return this.name;
	}
	
	@Override
	public String getStudentClass() {
		return this.className;
	}
	
	
}
