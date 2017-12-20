package com.design.patterns.singleton;

public class StaticBlockSingleton { 
	
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton(){}
	
	static{
		try{
			instance = new StaticBlockSingleton();
		}catch(Exception e){
			throw new RuntimeException();
		}
	}
	
	public static StaticBlockSingleton getInstance(){
		return instance;
	}
	
	public void callMe(){
		System.out.println("Singleton class using static block");
	}

}
