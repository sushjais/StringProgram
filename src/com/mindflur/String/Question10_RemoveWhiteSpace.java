//10) Java Program to remove all the white spaces from a string
package com.mindflur.String;

import java.util.Scanner;

public class Question10_RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String str=sc.nextLine();
		String str1;
		//Removes the white spaces using replace all   
        str1 = str.replaceAll("\\s+", "");
        System.out.println("String after removing all the white spaces : " + str1);  

	}

}
