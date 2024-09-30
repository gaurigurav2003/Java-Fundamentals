package array_1;
import java.util.*;
public class ArrayDemo_12 {

	public static void main(String[] args) {
		// find out maximum element from an array
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("enter the number");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max_element=arr[0];//imp step  <------
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max_element) {
				max_element=arr[i];//  <---------
			}
		}
		System.out.println("maximum element is "+max_element);

		

	}

}
