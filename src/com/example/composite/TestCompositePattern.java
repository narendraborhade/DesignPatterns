/**
 * @author Narendra Borhade
 *
 */
package com.example.composite;

public class TestCompositePattern {

	public static void main(String[] args) {

		Shape triangle1 = new Triangle();
		
		Shape triangle2 = new Triangle();
		
		Shape circle1 = new Circle();
		
		Shape rectangle1 = new Rectangle();
		
		Shape rectangle2 = new Rectangle();
		
		Drawing d = new Drawing();
		d.add(triangle1);
		d.add(triangle2);
		d.add(circle1);
		d.add(rectangle1);
		d.add(rectangle2);
		
		d.draw("Red");
		
		d.remove(triangle2);
		d.remove(rectangle2);
		
		d.clear();
		
		d.add(triangle2);
		d.add(circle1);
		d.add(rectangle1);
		d.draw("Green");
		
		
	}

}
