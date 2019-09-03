package com.ibm.sumapp;

public class Adder {

	
	public int add( int a, int b ) {
		int sum = a + b;
		
		// introduce an intermittent error added a comment
 		if( a == 3 ) { 
 			sum = a*a + b*b;
 		} 
		
		return sum;
	}
	
}
