package com.design.patterns.singleton;

public class Main {

	public static void main(String[] args) {

		EagerInitializedSingleton  eagerInitializedSingleton = EagerInitializedSingleton.getInstance();
		eagerInitializedSingleton.getMessage();
		
		LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
		lazyInitializedSingleton.getCall();
		
		StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
		staticBlockSingleton.callMe();
		
		ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
		threadSafeSingleton.getThreadSafeSingletonMessage();
		
	}

}
