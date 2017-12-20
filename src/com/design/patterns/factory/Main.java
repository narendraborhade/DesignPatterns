package com.design.patterns.factory;

public class Main {

	public static void main(String[] args) {

		Cricket c1 = (Cricket) Factory.getStudent("CRICKET", "1", "Naredra", "10th");
		Cricket c2 = (Cricket) Factory.getStudent("CRICKET", "2", "Yogesh", "10th");
		
		System.out.println("Cricket Team Players: ");
		System.out.println(c1);
		System.out.println(c2);
		
		Hockey h1 = (Hockey) Factory.getStudent("Hockey", "11", "Rajesh", "9th");
		Hockey h2 = (Hockey) Factory.getStudent("Hockey", "12", "Rakesh", "9th");
		
		System.out.println("Hockey Team Players: ");
		System.out.println(h1);
		System.out.println(h2);
		
		FootBall f1 = (FootBall) Factory.getStudent("FootBall", "21", "Mohan", "12th");
		FootBall f2 = (FootBall) Factory.getStudent("FootBall", "22", "Arjun", "12th");
		
		System.out.println("FootBall Team Players: ");
		System.out.println(f1);
		System.out.println(f2);
		
		
	}

}
