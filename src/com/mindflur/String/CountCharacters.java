//1) Java Program to count the total number of characters in a string
package com.mindflur.String;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		int count=0;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String::");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ')
				count++;
		}
		System.out.println("Total no of characters::"+count);

	}
	
}
