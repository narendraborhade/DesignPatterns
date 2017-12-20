/**
 * @author Narendra Borhade
 *
 */
package com.design.patterns.bridge;

public class BridgePatternTest {

	public static void main(String[] args) {

		Shape triangle = new Triangle(new RedColor());
		triangle.applyColor();
		
		Shape circle = new Circle(new GreenColor());
		circle.applyColor();
	}
}
