package week3.day6;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 * 
	 * 
	 * 
	 */
	 
	
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		char[] arr = text.toCharArray();
System.out.println("Displayed without Duplicate Words");

		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<text.length();i++)   
            set.add(arr[i]); 
            
        // print the string after removing duplicate characters   
        for(Character ch : set)   
            System.out.print(ch);   
    }   
		
		
	}
	
