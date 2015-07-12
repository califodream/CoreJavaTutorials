package com.sinha.tutorial.RegularExpression.coreConcept;

import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 'a' -- Searches EXACTLY one 'a', hence in given example output will be 6 a.
 * 
 * 'a+' -- Searches ATLEAST one 'a', meaning one or more consecutive occurrence of a. Hence the output will be a, aa, aaa.
 * 
 * 'a*' -- Searches ANY number of 'a', including Zero occurrence or nothing. Hence output will be a, aa, aaa where a is found, 
 * 		and blank where b is found, and Since cursor moves to end+1 location where nothing is there and hence blank.
 * 
 * 'a?' -- Searches ATMOST one 'a',  including Zero occurrence or nothing. Hence output will be a where a is found, 
 * 		and blank where b is found, and Since cursor moves to end+1 location where nothing is there and hence blank.
 * 
 * Bit careful with a* & a?.
 * 
 * @author kishore
 *
 */
public class QuantifiersRegExDemo {

	public static void main(String[] args) {

		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("a", "Searching EXACTLY one 'a'");
		hashtable.put("a+", "Searching ATLEAST one 'a'");
		hashtable.put("a*", "Searching ANY number of 'a', including ZERO number, including nothing as well.");
		hashtable.put("a?", "Searching ATMOST one 'a', including ZERO number, including nothing as well.");
	
		String targetString = "abaabaaab";
		
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
