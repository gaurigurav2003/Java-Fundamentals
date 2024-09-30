package array_1;
import java.util.*;

public class ArrayDemo_7 {

	public static void main(String[] args) {
		// sum of array elements
		
	Scanner sc=new Scanner(System.in);
         System.out.println("enter the size");
         int size=sc.nextInt();
         int sum=0;
         
         int arr[]=new int[size];
         System.out.println("enter the number of elements");
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
       }
       for(int i=0;i<arr.length;i++) {
    	   sum=sum+arr[i];
       }
       System.out.println("sum of array elements are "+sum);
	}

}
