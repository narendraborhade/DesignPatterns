package com.design.patterns.factory;

public class Hockey extends Student{

	private String rollNumber;
	private String name;
	private String className;
	
	public Hockey(String rollNumber, String name, String className) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.className = className;
	}
	
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
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
