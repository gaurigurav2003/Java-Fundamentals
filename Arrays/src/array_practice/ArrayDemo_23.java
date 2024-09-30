package array_1;
import java.util.*;
public class ArrayDemo_23 {

	public static void main(String[] args) {
		// wap to find an armstrong number from an array and return its index

		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter the element");
		
		for(int i=0;i<arr.length;i++) {
			
			 arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			int temp=arr[i];
			while(temp!=0) {
				int rem=temp%10;
				count++;
				temp=temp/10;
			
			int mult=1;
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				mult=mult*rem;
				sum=sum+mult;
				
			}
			mult=0;
			if(sum==arr[i]) {
			System.out.println("armstrong no "+arr[i]+"found at index :"+i);	
			}
		}
			
			
		
		
		
	}

}
}
