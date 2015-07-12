package com.sinha.tutorial.RegularExpression.coreConcept;

import java.util.StringTokenizer;

/**
 * Default Delimiter for StringTokenizer is Space(\\s), as shown in first example.
 * 
 * Need to define the Target String and Delimiter to get the StringTokenizer Object, as shown in next example.
 * 
 * @author kishore
 *
 */
public class StringTokenizerDemo {

	public static void main(String[] args) {

		StringTokenizer tokenizer = new StringTokenizer("Durga Software Solution");
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
		System.out.println("\n******************\n");
		StringTokenizer stringTokenizer = new StringTokenizer("11-07-2015","-");
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}
}
