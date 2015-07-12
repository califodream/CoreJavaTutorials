package com.sinha.tutorial.RegularExpression.examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author kishore
 *
 */
public class ValidEmailIDRegEx {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Email-ID");
		String str = scanner.next();
		
		Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher matcher = pattern.matcher(str);
		
		if(matcher.find() && matcher.group().equals(str)) {
			System.out.println("Valid Email-ID : "+matcher.group());
		}
		else
			System.out.println("Provided number is NOT Valid Email-ID");
	}
}
