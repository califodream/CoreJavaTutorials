package com.sinha.tutorial.RegularExpression.examples;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author kishore
 *
 */
public class SearchFileTypeInFolder {

	public static void main(String[] args) {

		int count = 0;
		Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9-_$.]*[.](txt|[lL]og)");
		
		File file = new File("/Users/kishore");
		String[] strArr = file.list();

		for (String string : strArr) {
			Matcher matcher = pattern.matcher(string);
		
			if(matcher.find() && matcher.group().equals(string)) {
				System.out.println(matcher.group());
				count++;
			}
		}
		System.out.println("Total Nummber of File Found : "+count);
	}
}
