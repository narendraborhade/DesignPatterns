package com.design.patterns.factory;

public class Factory {

	private final static String CRICKET = "Cricket";
	private final static String HOCKEY = "Hockey";
	
	public static Student getStudent (String game, String rollNumber, String name, String className){
		
		if(CRICKET.equalsIgnoreCase(game)){
			return new Cricket(rollNumber, name, className);
		} else if(HOCKEY.equalsIgnoreCase(game)){
			return new Hockey(rollNumber, name, className);
		} else {
			return new FootBall(rollNumber, name, className);
		}
	}
}
