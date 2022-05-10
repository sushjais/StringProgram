//5) Java Program to determine whether two strings are the anagram
/*Two Strings are called the anagram if they contain the same characters. However, 
 * the order or sequence of the characters can be different.
 * */
 
package com.mindflur.String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two String::");
		str1=sc.nextLine();
		str2=sc.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		//checking string length
		if(str1.length()!=str2.length()) {
			System.out.println("Both the strings are not anagram");
		}
		else {
		//converting both the arrays into char array
		char[] string1=str1.toCharArray();
		char[] string2=str2.toCharArray();
		//Sorting the arrays using in-built function sort ()  
        Arrays.sort(string1);  
        Arrays.sort(string2);  
      //Comparing both the arrays using in-built function equals ()  
        if(Arrays.equals(string1,string2)==true) {
        	System.out.println(str1+"="+str2+":::string are anagram");
        }
        else {
        	System.out.println("both the string are not anagram");
        }
		}

	}

}
