package com.design.patterns.abstractfactory;

public class Main {

	public static void main(String[] args) {

		CricketFactory c1 = new CricketFactory("1", "Naredra", "10th");
		CricketFactory c2 = new CricketFactory("2", "Yogesh", "10th");
		
		Student s1 = Factory.getStudent(c1);
		Student s2 = Factory.getStudent(c2);
		
		System.out.println("Cricket Team Players: ");
		System.out.println(s1);
		System.out.println(s2);

		HockeyFactory h1 = new HockeyFactory("11", "Rajesh", "9th");
		HockeyFactory h2 = new HockeyFactory("12", "Rakesh", "9th");
		
		Student s3 = Factory.getStudent(h1);
		Student s4 = Factory.getStudent(h2);
		
		System.out.println("Hockey Team Players: ");
		System.out.println(s3);
		System.out.println(s4);
		
		FootBallFactory f1 = new FootBallFactory("21", "Mohan", "12th");
		FootBallFactory f2 = new FootBallFactory("22", "Arjun", "12th");
		
		Student s5 = Factory.getStudent(f1);
		Student s6 = Factory.getStudent(f2);
		
		System.out.println("FootBall Team Players: ");
		System.out.println(s5);
		System.out.println(s6);
		
		
	}

}
