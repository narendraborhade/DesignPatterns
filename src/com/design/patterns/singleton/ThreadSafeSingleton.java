package com.design.patterns.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton(){}
	
	public static synchronized ThreadSafeSingleton getInstance(){
		
		if(instance == null){
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	public void getThreadSafeSingletonMessage(){
		System.out.println("You are in ThreadSafeSingleton class");
	}
}
