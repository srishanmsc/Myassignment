package week1.day2.Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.testng.internal.junit.ArrayAsserts;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class FindSecondLargest {
	public static void main(String[] args) {
    int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		System.out.println(data[2]);
		//System.out.println(data[1]);
		//for(int i=0;i<Array.getLength(data);i++)
		//	System.out.println(data);
		
}
}


