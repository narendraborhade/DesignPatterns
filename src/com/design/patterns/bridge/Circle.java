/**
 * @author Narendra Borhade
 *
 */
package com.design.patterns.bridge;

public class Circle extends Shape{

	public Circle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Circle filled with color ");
		color.applyColor();
	}

}
