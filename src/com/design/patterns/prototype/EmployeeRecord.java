/**
 * @author Narendra Borhade
 *
 */
package com.design.patterns.prototype;

public class EmployeeRecord implements EmployeeDetails{

	private int eid;
	private String name;
	private String designation;
	private String dept;
	
	public EmployeeRecord() {
		System.out.println("Employee Records");
		
		System.out.println("Employee Id : "+ eid);
		System.out.println("Employee Name : "+ name);
		System.out.println("Employee Designation :"+ designation);
		System.out.println("Employee Department :"+ dept);
	}
	
	public EmployeeRecord(int eid, String name, String designation, String dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.designation = designation;
		this.dept = dept;
	}
	
	public void showRecord(){
		System.out.println("Employee Records");
		System.out.println("Employee Id : "+ eid);
		System.out.println("Employee Name : "+ name);
		System.out.println("Employee Designation :"+ designation);
		System.out.println("Employee Department :"+ dept);
		System.out.println("------------------------------------");
	}

	@Override
	public EmployeeDetails getClone() {
		return new EmployeeRecord(eid,name,designation,dept);
	}
	
	
}
