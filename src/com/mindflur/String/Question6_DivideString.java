// 6.Java Program to divide a string in 'N' equal parts.
package com.mindflur.String;

import java.util.Scanner;

public class Question6_DivideString {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter any String");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.println("Enter the 'N' no for divide the string");
		int n=sc.nextInt();
		int len=str.length();
		int temp = 0, chars = len/n;  
	     //Stores the array of string  
	        String[] equalStr = new String [n];  
		if(len%n!=0) {
			System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");
		}
		else {
			for(int i=0;i<len;i=i+chars) {
				//Dividing string in n equal part using substring()  
				String part = str.substring(i, i+chars);  
                equalStr[temp] = part;  
                temp++;  
			}
		 System.out.println(n + " equal parts of given string are ");  
	            for(int i = 0; i < equalStr.length; i++) {  
	                System.out.println(equalStr[i]);  
	                }  
		}
		

	}

}
