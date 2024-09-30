/*
 Problem statement
You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec 
Note:
Consider the case when size of the two arrays is not same.
Sample Input 1 :
1
5
1 3 4 7 11
4
2 4 6 13
Sample Output 1 :
1 2 3 4 4 6 7 11 13 
Sample Input 2 :
2
3
10 100 500
7
4 7 9 25 30 300 450
4
7 45 89 90
0
Sample Output 2 :
4 7 9 10 25 30 100 300 450 500
7 45 89 90
 */

package Assignment;
import java.util.*;

public class MergeTwoSortesArrays {
	  public static int[] merge(int arr1[], int arr2[]) {
	    	int i=0;
	        int j=0;
	        int k=0;
	       int ans[]=new int[arr1.length+arr2.length];

	        while(i<arr1.length && j<arr2.length){
	            if(arr1[i]<arr2[j]){
	              ans[k]=arr1[i];
	              k++;
	              i++;

	            }
	            else{
	                ans[k]=arr2[j];
	                k++;
	                j++;

	            }
	               
	        }
	        while(i<arr1.length){
	            ans[k]=arr1[i];
	            k++;
	            i++;
	        }
	        while(j<arr2.length){
	             ans[k]=arr2[j];
	             k++;
	             j++;

	        }
	          return ans;
	        }

	        public static void main(String args[]){
	            Scanner sc=new Scanner(System.in);
	         int T=sc.nextInt();
	            for(int var=1;var>=T;var++){

	                int N=sc.nextInt();

	                int arr1[]=new int[N];

	                for(int i=0;i<arr1.length;i++){
	                arr1[i]=sc.nextInt();

	                }

	                 int M=sc.nextInt();

	                int arr2[]=new int[M];

	                for(int j=0;j<arr2.length;j++){
	                arr2[j]=sc.nextInt();

	                }
	                int ans[]=merge(arr1,arr2);
	            }
	           
	        }
}
