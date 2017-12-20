package com.design.patterns.abstractfactory;

public class Factory {

	public static Student getStudent (StudentAbstractFactory s){
		return s.getPlayer();
	}
}
