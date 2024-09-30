package array_1;
import java.util.*;
public class ArrayDemo_15 {

	public static void main(String[] args) {
		//merge the two given arrays
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		
		int size=sc.nextInt();
		
		System.out.println("enter the elements in 1st array");
		int arr1[]=new int[size];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter the elements in 2nd array");
		int arr2[]=new int[size];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int arr3[]=new int[size+size];
		
		for(int i=0;i<arr1.length;i++) {
			
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			
			arr3[size+i]=arr2[i];
		}
		System.out.println("merged array");
		for(int i=0;i<arr3.length;i++) {
			System.out.print(" "+arr3[i]+",");
		}
		
		
		
		

	}

}
