package array_1;

import java.util.Scanner;

public class ArrayDemo_21 {

	public static void main(String[] args) {
		// wap to find a palindrome number from an array and returns its index
		//take size and elements from the user
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter the element in the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int rev=0;
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			while(temp!=0) {
				int rem=temp%10;
				 rev=rev*10+rem;
				 temp=temp/10;
			}
			if(arr[i]==rev) {
				System.out.println("palindrome no "+arr[i]+" found at "+i);
			}
			rev=0;
		}

	

}
}
