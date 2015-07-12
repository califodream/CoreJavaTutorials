package com.sinha.tutorial.RegularExpression.examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author kishore
 *
 */
public class IndianMobileNumberRegEx {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Mobile Number");
		String str = scanner.next();
		
		Pattern pattern = Pattern.compile("(91|0)?[7-9][0-9]{9}");
		Matcher matcher = pattern.matcher(str);
		
		if(matcher.find() && matcher.group().equals(str)) {
			System.out.println("Valid Mobile Number : "+matcher.group());
		}
		else
			System.out.println("Provided number is NOT Valid Mobile Number");
	}
}
