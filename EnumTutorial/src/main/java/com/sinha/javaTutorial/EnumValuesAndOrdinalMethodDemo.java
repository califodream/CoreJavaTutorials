package com.sinha.javaTutorial;

/**
 * This class shows how to use values() method.
 * 
 * values() - Used to list out all the constants of Enum , where we know the Enum but not its content.
 * It will return the array of Enum type.
 *  
 * ordinal() - Used to find the ordinal value of Enum constant. It starts with 0. Its exactly like array index. 
 * 
 * Notice here, enum is declared inside class.
 * 
 * @author kishore
 *
 */
public class EnumValuesAndOrdinalMethodDemo {

	private enum Direction {
		NORTH, SOUTH, EAST, WEST;
	}

	public static void main(String[] args) {

		Direction[] directions = Direction.values();
		for (Direction direction : directions) {
			System.out.println(direction +"...."+direction.ordinal());
		}
	}
}
