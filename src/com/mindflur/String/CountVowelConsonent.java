//4) Java Program to count the total number of vowels and consonants in a string
package com.mindflur.String;

import java.util.Scanner;

public class CountVowelConsonent {

	public static void main(String[] args) {
		String str;
		int vCount=0,cCount=0,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		str=scan.nextLine();
		//Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				//Increments the vowel counter   
				vCount++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
                cCount++;    
            }    
		}
     System.out.println("Total no of vowels::"+vCount);
     System.out.println("Total no of vowels::"+cCount);
	}

}
