package com.sinha.javaTutorial;

/**
 * This class will explain how to do specific method implementation for particular Enum Constant.
 * 
 * Its done using anonymous inner class implementation in Enum.
 * 
 * Syntax in open close curly braces and write method implementation.
 * 
 * For below commented code, same getInfo() method will be called for every Enum constant.
 *  
 * BUt for uncommente code Enum, specific getInfo() method will be called for RED, which is inner implementation
 * 
 * @author kishore
 *
 */
public class EnumConstantSpecificMethodImplDemo {

	/**
	enum Color {
		BLUE, RED, GREEN;
		
		public void getInfo(){
			System.out.println(this + " : Universal Color");
		}
	}*/
	
	enum Color {
		BLUE, RED{
			public void getInfo(){
				System.out.println(this + " : Dangerous Color");
			}
		}, GREEN;
		
		public void getInfo(){
			System.out.println(this + " : Universal Color");
		}
	}
	
	public static void main(String[] args) {

		Color[] colors = Color.values();
		for (Color color : colors) {
			color.getInfo();
		}
	}
}
