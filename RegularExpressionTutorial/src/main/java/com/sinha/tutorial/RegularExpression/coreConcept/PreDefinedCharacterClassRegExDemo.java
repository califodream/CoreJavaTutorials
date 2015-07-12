package com.sinha.tutorial.RegularExpression.coreConcept;

import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author kishore
 *
 */
public class PreDefinedCharacterClassRegExDemo {

	public static void main(String[] args) {

		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("\\s", "Searching for Space Character");
		hashtable.put("\\S", "Searching EXCEPT Space Characeter, i.e, Any Character");
		hashtable.put("\\d", "Searching any digit");
		hashtable.put("\\D", "Searching EXCEPT digits");
		hashtable.put("\\w", "Searching any AlphaNumeric Character");
		hashtable.put("\\W", "Searching EXCEPT AlphaNumeric Character");
		hashtable.put(".", "Searching ANY Character");
	
		String targetString = "a7Mb Z#9";
		
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
