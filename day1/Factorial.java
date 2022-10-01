package week.day1;

public class Factorial {
public static void main(String[] args) {
	int i,fact=1;  
	  int number=5;//It is the number to calculate factorial    
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+number+ " is: "+fact);    
}
}

// iteratio 1 i=1; i<=number conditon true
//fact=fact*1  means already fact value i now 1*1 save in fact variable . sinc fact value is now 1

// incretment i++
// now i value 2
//i<=number  means i<=5 condition true 
//fact =fact*1 already fact value 1 now 
//fact=1*2 now fact value is 2

//incretment i++
//now i value 3
//i<=number  means i<=5 condition true 
//fact =fact*1 already fact value 2 now 
//fact=2*3 now fact value is 6

//incretment i++
//now i value 4
//i<=number  means i<=5 condition true 
//fact =fact*1 already fact value 6 now 
//fact=6*4 now fact value is 24

//incretment i++
//now i value 5
//i<=number  means i<=5 condition true 
//fact =fact*1 already fact value 24 now 
//fact=24*5 now fact value is 120