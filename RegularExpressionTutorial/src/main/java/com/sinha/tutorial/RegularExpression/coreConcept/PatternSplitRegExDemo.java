package com.sinha.tutorial.RegularExpression.coreConcept;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Patter class split() method takes Target String as argument.
 * After split, we will get tokens other than pattern.  
 * 
 * @author kishore
 *
 */
public class PatternSplitRegExDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("\\s");
		list.add("a");
		list.add("o");
		for (String str : list) {
			Pattern pattern = Pattern.compile(str);
			String[] strArr = pattern.split("Durga Software Solutions");
			for (String string : strArr) {
				System.out.println(string);
			}
			System.out.println("\n********************\n");
		}
	}
}
