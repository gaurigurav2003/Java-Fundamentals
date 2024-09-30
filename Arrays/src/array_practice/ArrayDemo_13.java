package array_1;

import java.util.Scanner;

public class ArrayDemo_13 {

	public static void main(String[] args) {
		//common elements from both the array
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		
		System.out.println("enter the element for 1st array");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter the element for 2nd array");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		int common=0;
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					common=arr1[i];
					System.out.println("common elements "+common);
				}
			}
		}
		

	}

}
