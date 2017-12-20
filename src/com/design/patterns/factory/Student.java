package com.design.patterns.factory;

public abstract class Student {

	public abstract String getStudentRollNumber();
	
	public abstract String getStudentName();
	
	public abstract String getStudentClass();

	@Override
	public String toString() {
		return "Student [RollNumber=" + getStudentRollNumber() + ", Name=" + getStudentName()
				+ ", Class=" + getStudentClass() + "]";
	}
	
}
