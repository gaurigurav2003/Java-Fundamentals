package array_1;
import java.util.*;
public class ArrayDemo_17 {

	public static void main(String[] args) {
		// write a program to print the count of digits in elements of array

	
				
				Scanner sc=new Scanner(System.in);
				System.out.println("enter size");
				int size=sc.nextInt();
				
				
		        int arr1[]=new int[size];
		        
		        System.out.println("enter the array elements");
		        for(int i=0;i<arr1.length;i++) {
		        	arr1[i]=sc.nextInt();
		        	
		        }
		        for(int i=0;i<arr1.length;i++) {
		        	int count=0;
		        	int temp=arr1[i];
		        	while(temp!=0) {
		        		int rem=temp%10;
		        		count++;
		        		temp=temp/10;
		        	}
		        	temp=0;
		        	System.out.println(count);
		        }
		     
		        

			}

		}

