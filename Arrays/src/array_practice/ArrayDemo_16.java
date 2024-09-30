package array_1;
import java.util.*;
public class ArrayDemo_16 {

	public static void main(String[] args) {
		// wap to print the element whose addition of digits is even
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		
		
        int arr1[]=new int[size];
        
        System.out.println("enter the array elements");
        for(int i=0;i<arr1.length;i++) {
        	arr1[i]=sc.nextInt();
        	
        }
        for(int i=0;i<arr1.length;i++) {
        	int sum=0;
        	int temp=arr1[i];
        	while(temp!=0) {
        		int rem=temp%10;
        		 sum=sum+rem;
        		temp=temp/10;
        	}
        	temp=0;
        	System.out.println(sum);
        }
     
        

	}

}
