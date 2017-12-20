/**
 * @author Narendra Borhade
 *
 */
package com.design.patterns.bridge;

public abstract class Shape {

	//Composition - implementor
	protected Color color;

	//constructor with implementor as input argument
	public Shape(Color c) {
		super();
		this.color = c;
	}
	
	abstract public void applyColor();
	
}
