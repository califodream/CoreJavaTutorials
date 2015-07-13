package com.sinha.javaTutorial;

/**
 * 
 * @author kishore
 *
 */
public class EnumAccessAndPrintDemo {

	public static void main(String[] args) {

		Direction direction = Direction.EAST;
		System.out.println(direction);
	}

}

enum Direction {
	NORTH, SOUTH, EAST, WEST;
}