package array_1;

import java.util.Scanner;

public class ArrayDemo_3 {

	public static void main(String[] args) {
		// wap to take the size of array from the user and also take integer elements
		// from the user print the product of odd elements only
		
Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the size");
		int size=obj.nextInt();//6
		
		
		int arr[]=new int[size];
		int product=1;
		
		System.out.println("enter the number of elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=obj.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				product=product*arr[i];
				
			}
			
		}
		System.out.println("the product of odd elements only "+product);
		

	}

}
