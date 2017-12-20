/**
 * @author Narendra Borhade
 *
 */
package com.example.composite;

public class Circle implements Shape{

	@Override
	public void draw(String color) {

		System.out.println("Circle: " + color);
	}

	@Override
	public String toString() {
		return "Circle";
	}

	
}
