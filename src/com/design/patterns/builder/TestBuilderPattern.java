/**
 * @author Narendra Borhade
 *
 */
package com.design.patterns.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {

		Computer c = new Computer.ComputerBuilder("HP", "1 TB", "4 GB").
				setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
		
		System.out.println("Computer Configuration:" +c.toString());
	}

}
