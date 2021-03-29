import java.io.*;

import java.util.Scanner;

public class IQ {    

	public static void main(String[] args) {  
		System.out .println("Welcome to Java Prorgram that will store a list of results that 5 people have scored on an IQ test. "); 
		
		System.out.println();
		
		System.out.println("Please enter the amount of IQ test scores: "); 
		
		Scanner scnr = new Scanner(System.in); 
		
		int length = scnr.nextInt(); 
		int[] input = new int[length]; 
		
		System.out.println("Please enter the test scores: "); 
		
		for (int i = 0; i < length; i++) { 
			
			input[i] = scnr.nextInt(); 
			
		} 
		
		float average = average(input); 
		
		System.out.println("Average of all numbers in array is " + average); 
		
		scnr.close(); 
		
		// Description assigned based on the Average IQ
		if (average >= 130 ) {
			System.out.println("Average test scores Very Superior");
		}
		else if (average >= 120 && average <= 129) {
			System.out.println("Average test scores Superior");
		}
		else if (average >= 110 && average <= 119) {
			System.out.println("Average test scores High Average");
		}
		else if (average >= 90 && average <= 109) {
			System.out.println("Average test scores Average");
		}
		else if (average >= 80 && average <= 89) {
			System.out.println("Average test scores Low Average");
		}
		else if (average >= 70 && average <= 79) {
			System.out.println("Average test scores Very Borderline");
		}
		else {
			System.out.println("Average test scores Extremely Low");
		}
		
	
	
	    } 
	
	/** * Java method to calculate average of all numbers of array * * @param input * @return average of all numbers in array */ 
	
	public static float average(int[] input) { 
		
		float sum = 0f; 
		for (int number : input) { 
			
			sum = sum + number; 
		} 
		
		return sum / input.length; 
		}

	} 
	  
  