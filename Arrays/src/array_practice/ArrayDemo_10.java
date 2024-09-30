package array_1;
import java.util.*;
public class ArrayDemo_10 {

	public static void main(String[] args) {
		// wap to search a specific element from an array and return its index

		Scanner sc=new Scanner(System.in);
		System.out.println("enter size ");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter the number of elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("elements to search");
		int search_num=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search_num) {
				System.out.println("element fount at index "+i);
			}
			
		}
		
		}

}
