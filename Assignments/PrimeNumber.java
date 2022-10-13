package week1.day2.Assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		
	 int num=13;
 boolean a=false;
 for(int i=2;i<=num/2;i++) {
	 if(num%i==0) {
		a=true;
 break;
	 }
 }
if(a=true) 
{
	System.out.println("The number is prime" + num);
}
	else 
		System.out.println("the nuber is non prime");
}
}

