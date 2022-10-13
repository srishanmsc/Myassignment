package week1.day2.Assignments;

public class Amstrongnumber {
	public static void main(String[] args) {
		
	
	// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
    int num=244;
	int calculated=0,remainder=0,Quotient=0;
	int original=0;
		// Assign input into variable original 
    original=num;
	// Use loop to calculate: use while loop to set condition until the number greater than 0
	while(num>0) {
		// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
		remainder=num%10;
	// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
	Quotient=num/10;
	// Within loop: Add calculated with the cube of remainder & assign it to calculated
	calculated=calculated + remainder*remainder*remainder;
	num=Quotient;
	}
	// Check whether calculated and original are same
	if(calculated==original) {
		System.out.println(calculated + " " +"The numebr is Amstrong" );
	}
		else 
			System.out.println(calculated + " " +"The number is not an amstrong");
	}
	
		
}
	
	
	

