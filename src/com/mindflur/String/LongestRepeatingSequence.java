//8) Java Program to find the longest repeating sequence in a string
package com.mindflur.String;

import java.util.Scanner;

public class LongestRepeatingSequence {
	
	//Checks for the largest common prefix  
       public static String lcp(String s, String t){  
        int n = Math.min(s.length(),t.length());  
        for(int i = 0; i < n; i++){  
            if(s.charAt(i) != t.charAt(i)){  
                return s.substring(0,i);  
            }  
        }  
        return s.substring(0,n);  
     }  

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		int n = str.length();  
		String lrs="";
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			 //Checks for the largest common factors in every substring  
                String x = lcp(str.substring(i,n),str.substring(j,n));  
              //If the current prefix is greater than previous one then it takes the current one as longest repeating sequence
                if(x.length() > lrs.length()) 
                	lrs=x;  
			}
		}
      System.out.println("Longest repeating sequence: "+lrs);
	}

}
