package array_1;
import java.util.*;
public class ArrayDemo_6 {

	public static void main(String[] args) {
		//write a program , take 10 input from the user and print only elements that are divisible 
		// by 5
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("enter the no of elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5==0) {
				System.out.print(" "+arr[i]);
			}
		}
		
		
		

	}

}
