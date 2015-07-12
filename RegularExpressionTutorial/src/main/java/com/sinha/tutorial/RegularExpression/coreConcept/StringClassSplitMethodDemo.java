package com.sinha.tutorial.RegularExpression.coreConcept;

/**
 * String class split() method is also used to split the Target String and get the tokens.
 * String class split() method takes pattern as argument, as Target String is already avaiable. 
 * 
 * @author kishore
 *
 */
public class StringClassSplitMethodDemo {

	public static void main(String[] args) {

		String targetString = "Durga Software Solution";
		String[] strArr = targetString.split("\\s");
		for (String string : strArr) {
			System.out.println(string);
		}
	}
}
