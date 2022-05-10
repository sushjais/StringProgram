//3.Java Program to count the total number of punctuation characters exists in a String
package com.mindflur.String;

import java.util.Scanner;

public class PunctuationCount {

	public static void main(String[] args) {
		String str;
		int count=0,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String with punctuation mark");
		str=scan.nextLine();
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)=='!'||str.charAt(i)==','||str.charAt(i)==':'||str.charAt(i)==';'||str.charAt(i)=='?'||
					str.charAt(i)=='.'||str.charAt(i)=='\"'||str.charAt(i) == '\'') {
				count++;
			}
		}
     System.out.println(" the total number of punctuation characters exists in a String::" +count);
	}

}

