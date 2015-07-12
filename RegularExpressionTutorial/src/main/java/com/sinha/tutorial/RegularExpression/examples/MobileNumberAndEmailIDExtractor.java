package com.sinha.tutorial.RegularExpression.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author kishore
 *
 */
public class MobileNumberAndEmailIDExtractor {

	public static void main(String[] args) throws Exception {

		String mobilePattern = "(91|0)?[0-9]{9}";
		String emailIDPattern = "[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
		
		Pattern pattern = Pattern.compile("("+mobilePattern+"|"+emailIDPattern+")");
//		Pattern pattern = Pattern.compile("((91|0)?[0-9]{9}|[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+)");
		
//		Pattern pattern = Pattern.compile(emailIDPattern);
		
		PrintWriter printWriter = new PrintWriter("src/main/resources/outputFile.txt");

		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/inputFile.txt"));
		String line = bufferedReader.readLine();
		
		while(line != null) {
		
			Matcher matcher = pattern.matcher(line);
			if(matcher.find()) {
				printWriter.println(matcher.group());
			}
			line = bufferedReader.readLine();
		}
		printWriter.flush();
		printWriter.close();
		bufferedReader.close();
	}
}
