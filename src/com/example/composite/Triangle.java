/**
 * @author Narendra Borhade
 *
 */
package com.example.composite;

public class Triangle implements Shape{

	@Override
	public void draw(String color) {

		System.out.println("Triangle: " + color);
	}

	@Override
	public String toString() {
		return "Triangle";
	}
	
	

}
