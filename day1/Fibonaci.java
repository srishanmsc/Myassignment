package week.day1;

public class Fibonaci {
	public static void main(String[] args) {
		int a=0;
		int s=1;
		int n=10;
		System.out.println("Fibonacci series of " + n + "is" );
		for(int i=1;i<=n;++i) {
			System.out.println(a);
			int sum =a+s;
		     a=s;
		     s=sum;
		}
			
	}
	}