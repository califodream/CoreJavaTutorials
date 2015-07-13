package com.sinha.javaTutorial;

/**
 * Java Enum can handle any member variables or methods or constructors in addition to list of constructors.
 * 
 * Java Enum can be used as normal class, but list of constant must be declared at the beginning and compulsory ends with semicolon(;).
 * 
 * 
 * @author kishore
 *
 */
public enum EnumMainMethodDemo {

	RED, GREEN, YELLOW;
	
	public static void main(String[] args) {

		System.out.println("Inside Enum Main Method");
	}
}
