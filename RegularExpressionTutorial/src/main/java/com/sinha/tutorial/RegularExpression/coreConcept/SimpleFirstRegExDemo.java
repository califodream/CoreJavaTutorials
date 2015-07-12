package com.sinha.tutorial.RegularExpression.coreConcept;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Simple RegexDemo example to show 
 * 
 * Create Pattern Object using compile method with patter string, which need to search.
 * Create Matcher Object using matcher method with target string where pattern need to search.
 * Start find/search operation.
 * 
 * matcher.find() -- checks if the pattern is found or not and return boolean.
 * matcher.start() -- returns the start index of the found string.
 * matcher.end() -- returns the end index+1 of the found index. 
 * matcher.group() --  returns the matched string.
 * 
 * @author kishore
 *
 */
public class SimpleFirstRegExDemo {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("ab");
		Matcher matcher = pattern.matcher("ababbaba");
		
		while(matcher.find()){
			System.out.println(matcher.start()+"...."+matcher.end()+"...."+matcher.group());
		}
	}
}
