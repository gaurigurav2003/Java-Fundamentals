package array_1;
import java.util.*;

public class ArrarDemo_1 {

	public static void main(String[] args) {
		//wap to take size of array from the user and also take integer elementsfrom 
		//  user print sum of odd elements only
		
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the size of array");
		int size=obj.nextInt();//5
		int sum=0;
		//int count=0;
		
		int arr[]=new int[size];
		
		System.out.println("enter the number of elements");
		for(int i=0;i<size;i++) {
			arr[i]=obj.nextInt();
			
		}
		
		for(int i=0;i<size;i++) {
			if(arr[i]%2!=0) {
				sum=sum+arr[i];
				
			}
		}
		System.out.println("sum of odd elements "+sum);
		

	}

}
