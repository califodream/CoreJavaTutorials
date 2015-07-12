package com.sinha.tutorial.RegularExpression.coreConcept;

import java.util.ArrayList;
import java.util.regex.Pattern;


/**
 * Need to be careful when we have to split target string based on . (dot).
 * 
 * There are 2 ways to split the target string based on . (dot), as shown below in example.
 *   
 * @author kishore
 *
 */
public class PatternSplitWithDotRegExDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("\\.");
		list.add("[.]");
		for (String str : list) {
			Pattern pattern = Pattern.compile(str);
			String[] strArr = pattern.split("www.durgasoftware.com");
			for (String string : strArr) {
				System.out.println(string);
			}
			System.out.println("\n********************\n");
		}
	}
}
