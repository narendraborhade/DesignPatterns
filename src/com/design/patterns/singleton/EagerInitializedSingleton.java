package com.design.patterns.singleton;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){
    	
    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
    
    public void getMessage(){
    	System.out.println("Hello, you are in Singleton class");
    }
    
}
