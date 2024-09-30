package array_1;
import java.util.*;
public class ArrayDemo_19 {

	public static void main(String[] args) {
		// wap to find a composite number from an array and return its index
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		
		int size=sc.nextInt();
		int arr1[]=new int[size];
		
		System.out.println("enter elements in array");
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++) {
			
			 int x=arr1[i];
			 int count=0;
			 for(int j=1;j<=x;j++) {
				 if(x%j==0) {
					 count++;
				 }
				 
			 }
			 
			 if(count>2) {
				 System.out.println("found at "+arr1[i]+" "+i);
			 }
		}
		
		

	}

}
