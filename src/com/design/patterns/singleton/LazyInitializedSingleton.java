package com.design.patterns.singleton;

public class LazyInitializedSingleton {
	
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton(){}
	
	public static LazyInitializedSingleton getInstance(){
		
		if(instance == null){
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
	
	public void getCall(){
		System.out.println("This is LazyInitializedSingleton call");
	}

}
