/*
 Problem statement
Sort the given unsorted array 'arr' of size 'N' in non-decreasing order using the selection sort algorithm.

 Note:
Change in the input array/list itself. 

Example:
Input:
N = 5
arr = {8, 6, 2, 5, 1}

Output:
1 2 5 6 8 
Explanation: add-image

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
6
2 13 4 1 3 6 
Sample Output 1:
1 2 3 4 6 13 
Explanation Of Sample Input 1:
 Select 1 and swap with element at index 0. arr= {1,13,4,2,3,6}

 Select 2 and swap with element at index 1. arr= {1,2,4,13,3,6}

 Select 3 and swap with element at index 2. arr= {1,2,3,13,4,6}

 Select 4 and swap with element at index 3. arr= {1,2,3,4,13,6}

 Select 6 and swap with element at index 4. arr= {1,2,3,4,6,13}
Sample Input 2:
5
9 3 6 2 0
Sample Output 2:
0 2 3 6 9
Constraints :
1 <= N <= 10^3
0 <= arr[i] <= 10^5
Time Limit: 1 sec
 import java.util.*;
 public class Solution {
    public static void selectionSort(int[] arr) {
       for(int i=0;i<arr.length;i++){
                int min=arr[i];
                int minindex=i;

                for(int j=i+1;j<arr.length;j++){
                       
                       if(min>arr[j]){


 */

package Assignment;
import java.util.*;

public class SelectionSort {

	 public static void selectionSort(int[] arr) {
	       for(int i=0;i<arr.length;i++){
	                int min=arr[i];
	                int minindex=i;

	                for(int j=i+1;j<arr.length;j++){
	                       
	                       if(min>arr[j]){
	                           min=arr[j];
	                           minindex=j;
	                       }


	                }

	                arr[minindex]=arr[i];
	                arr[i]=min;


	       }

	    //    for(int i=0;i<arr.length;i++){
	    //        System.out.print(arr[i]+" ");
	    //    }
	    }

	            public static void main(String args[]){
	                Scanner sc=new Scanner(System.in);

	                int N=sc.nextInt();

	                int arr[]=new int[N];

	                for(int i=0;i<arr.length;i++){
	                       arr[i]=sc.nextInt();

	                }
	                 selectionSort(arr);


	            }
}
