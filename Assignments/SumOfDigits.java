package week1.day2.Assignments;

public class SumOfDigits {
	public static void main(String[] args) {
	
	// Declare your input number (int)
   int a=123,Rem,Quo;
   //Initialize an integer variable by name: sum
   int sum=0;
//Use loop to calculate the sum: use while loop to set condition until the number goes greater than 0
while(a>10) {
	// Within loop: get the remainder when done by 10 -> Tip: use mod %
	Rem=a%10;
	System.out.println("Remainder is " + Rem);
	// Within loop: add that remainder to the sum
	sum= Rem + sum;
	System.out.println("Sum is " + sum);
	// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
	Quo=a/10;
	a=Quo;
	// Print the quotient to confirm
	System.out.println("Quotient is"+ a);
	
}
System.out.println("Final sum is " + sum);
	}	 
}

