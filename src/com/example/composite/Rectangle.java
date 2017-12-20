/**
 * @author Narendra Borhade
 *
 */
package com.example.composite;

public class Rectangle implements Shape{

	@Override
	public void draw(String color) {

		System.out.println("Rectangle: " + color);
	}

	@Override
	public String toString() {
		return "Rectangle";
	}

	
}
