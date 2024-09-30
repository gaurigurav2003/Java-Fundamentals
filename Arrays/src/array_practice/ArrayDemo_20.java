package array_1;
import java.util.*;
public class ArrayDemo_20 {

	public static void main(String[] args) {
		// wap to find a prime number from an array and return its index take size and 
		// elements from the user

		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter the element in the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			int count=0;
			for(int j=1;j<=x;j++) {
				if(x%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("prime no "+arr[i]+"fount at index: "+i);
			}
			
		}
		
	}

}
