/*
 Problem statement
Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5

Time Limit: 1sec
Sample Input 1:
1
3
9 8 9
Sample Output 1:
26
Sample Input 2:
2
5
1 2 3 4 5 
3
10 20 30 
Sample Output 2:
15
60
 */

package Assignment;
import java.util.*;

public class ReturnArraySum {

	public static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];           
 
		}
		return sum;
	}

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		int T=sc.nextInt();

		for(int j=1;j<=T;j++){

            int size=sc.nextInt();
			int arr[]=new int[size];

           for(int i=0;i<arr.length;i++ ){
               arr[i]=sc.nextInt();

		   }
		   int largest=sum(arr);
		   System.out.println(largest);

			

		}
	}
}
