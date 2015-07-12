package com.sinha.tutorial.RegularExpression.coreConcept;

import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author kishore
 *
 */
public class CharacterClassRegExDemo {

	public static void main(String[] args) {
		
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("[abc]", "Searching 'a' or 'b' or 'c'");
		hashtable.put("[^abc]", "Searching EXCEPT 'a' and 'b' and 'c'");
		hashtable.put("[a-z]", "Searching any Lower Case alphabet symbol");
		hashtable.put("[A-Z]", "Searching any Upper Case alphabet symbol");
		hashtable.put("[a-zA-Z]", "Searching any Alphabet symbol");
		hashtable.put("[0-9]", "Searching any digit from 0-9");
		hashtable.put("[a-zA-Z0-9]", "Searching any AlphaNumeric symbol");
		hashtable.put("[^a-zA-Z0-9]", "Searching any Special character symbol");

		String targetString = "a7Mb@Z#9";
		
		for (String keyStr : hashtable.keySet()) {
			System.out.println("**** "+hashtable.get(keyStr)+" ****");
			Pattern p = Pattern.compile(keyStr);
			Matcher m = p.matcher(targetString);
			while(m.find()){
				System.out.println(m.start()+"...."+m.group());
			}
			System.out.println("\n");
		}
	}
}
