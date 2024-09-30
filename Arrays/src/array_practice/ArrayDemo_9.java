package array_1;

import java.util.Scanner;

public class ArrayDemo_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size");
		int size=sc.nextInt();
		int even_sum=0;
		int odd_sum=0;
		
		int arr[]=new int[size];
		System.out.println("enter the number of elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even_sum=even_sum+arr[i];
				
			}else {
				odd_sum=odd_sum+arr[i];
			}
		}
		System.out.println("number of even elements "+even_sum);
		System.out.println("number of odd elements "+odd_sum);


	}

}
