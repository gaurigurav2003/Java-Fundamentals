/*
 Problem statement
You are given an integer array 'arr' of size 'N'.

Note:
Change in the input array itself. You don't need to return or print the elements.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^3
0 <= arr[i] <= 10^5
Time Limit: 1 sec
Sample Input 1:
5
9 3 6 2 0
Sample Output 1:
0 2 3 6 9
Sample Input 2:
4
4 3 2 1
Sample Output 2:
1 2 3 4
 */

package Assignment;
import java.util.*;

public class InsertionSort {

	 public static void insertionSort(int[] arr, int size) {
	       for(int i=1;i<arr.length;i++){
	             int temp=arr[i];
	             int j=i-1;

	             while(j>=0 && arr[j]>temp){
	                 arr[j+1]=arr[j];
	                 j--;
	             }
	             arr[j+1]=temp;



	       }
	    }


	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);

	        int N=sc.nextInt();

	        int arr[]=new int[N];

	        for(int i=0;i<N;i++){

	            arr[i]=sc.nextInt();
	        }
	            insertionSort(arr,N);

	    }
}
