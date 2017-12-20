/**
 * @author Narendra Borhade
 *
 */
package com.design.patterns.prototype;

public class Main {

	public static void main(String[] args) {

		EmployeeRecord er1 = new EmployeeRecord(1, "Ram", "Clerk", "Accounts");
		er1.showRecord();
		
		EmployeeRecord er2 = (EmployeeRecord) er1.getClone();
		er2.showRecord();
	}

}
