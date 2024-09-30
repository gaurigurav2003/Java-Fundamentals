package array_1;
import java.util.*;


public class ArrayDemo_2 {

	public static void main(String[] args) {
		// wap to take the size of array from the user and also take the integer 
		// elements from user print product of even elements only
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the size");
		int size=obj.nextInt();//9
		
		
		int arr[]=new int[size];
		int product=1;
		
		System.out.println("enter the number of elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=obj.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				product=product*arr[i];
				
			}
			
		}
		System.out.println("the product of even elements only "+product);
		

	}

}
