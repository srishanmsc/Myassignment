package week1.day2.Assignments;

public class PrintDuplicateNumber {
public static void main(String[] args) {
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	int a=arr.length;
	System.out.println("Array length is " + a);
	int count;
	for(int i=0;i<arr.length-1;i++) {
		count=0;
		for (int j=i+1;j<a;j++) {
			if(arr[i]==arr[j]) {
				count++;
				
			}
		}
		if(count>0) {
			System.out.println(arr[i]);
		}
	}
	
}	
		
	}
	



