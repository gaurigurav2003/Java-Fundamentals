package array_1;

import java.util.Scanner;

public class ArrayDemo_18 {

	public static void main(String[] args) {
		// reverse the each element in the array
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		
		
        int arr1[]=new int[size];
        
        System.out.println("enter the array elements");
        for(int i=0;i<arr1.length;i++) {
        	arr1[i]=sc.nextInt();
        	
        }
        for(int i=0;i<arr1.length;i++) {
        	int rev=0;
        	int temp=arr1[i];
        	while(temp!=0) {
        		int rem=temp%10;
        		 rev=rev*10+rem;
        		temp=temp/10;
        	}
        	arr1[i]=rev;
        	temp=0;
        	System.out.println(arr1[i]);
        }
     

	}

}
