package array_1;
import java.util.*;

public class ArrayDemo_8 {

	public static void main(String[] args) {
		// odd and even integers in the given array
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size");
		int size=sc.nextInt();
		int even_count=0;
		int odd_count=0;
		
		int arr[]=new int[size];
		System.out.println("enter the number of elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even_count++;
				
			}else {
				odd_count++;
			}
		}
		System.out.println("number of even elements "+even_count);
		System.out.println("number of odd elements "+odd_count);

	}

}
