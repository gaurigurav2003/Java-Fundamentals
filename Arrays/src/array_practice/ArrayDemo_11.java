package array_1;
import java.util.*;
public class ArrayDemo_11 {

	public static void main(String[] args) {
		// min element from an array
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("enter the number");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int min_element=arr[0];//imp step  <------
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min_element) {
				min_element=arr[i];//  <---------
			}
		}
		System.out.println("minimum element is "+min_element);

	}

}
