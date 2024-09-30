/*
 Problem statement
Given two unsorted arrays of non-negative integers, 'arr1' and 'arr2' of size 'N' and 'M', respectively. Your task is to find the pair of elements (one from each array), such that their absolute (non-negative) difference is the smallest, and return the min difference.

Example :
N = 3, arr1 = [10, 20, 30]
M = 2, arr2 = [17, 15]
The smallest difference pair is (20, 17) with an absolute difference of 3. So, the answer is 3.
Note :
Both the arrays are unsorted, and all array elements are non-negative integers.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10
1 <= N, M <= 1000
0 <= arr1[i], arr2[i] <=10^6

Time Limit: 1 second
Sample input 1 :
2
3 3
12 7 5
4 4 6
3 2
10 20 30 
17 15
Sample output 1 :
1
3
Explanation For Sample Input 1 :
Test Case 1 :
The smallest difference pairs are (7, 6) and (5, 6) with an absolute difference of 1, so the answer is 1.

Test Case 2 :
The smallest difference pair is (20, 17) with an absolute difference of 3, so the answer is 3.
Sample input 2 :
2
4 4
1 5 12 3
16 9 10 20
2 4
20 10
10 13 19 16
Sample output 2 :
2
0
 */

package Assignment;
import java.util.*;

public class Find_paiwith_smallest_Diff {

	public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
	      int Diff=Integer.MAX_VALUE;

	      for(int i=0;i<arr1.length;i++){

	             for(int j=0;j<arr2.length;j++){

	                 if(Math.abs(arr1[i]-arr2[j])<=Diff){
	                     Diff=Math.abs(arr1[i]-arr2[j]); //it gives positive value
	                 }
	             }
	      }
	      return Diff;
	    }

	    public static void main(String arggs[]){

	        Scanner sc=new Scanner(System.in);

	        int T=sc.nextInt();

	        for(int k=1;k<=T;k++){

	                  int N=sc.nextInt();
	                  int M=sc.nextInt();

	                  int arr1[]=new int[N];
	                  int arr2[]=new int[M];

	                  for(int i=0;i<N;i++){
	                      arr1[i]=sc.nextInt();
	                  }
	                   for(int j=0;j<M;j++){
	                      arr2[j]=sc.nextInt();
	                  }
	                  int ans=smallestDifferencePair(arr1,N,arr2,M);
	                  System.out.println(ans);

	        }
	    }
}
