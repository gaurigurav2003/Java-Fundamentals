/*
 Problem statement
You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.

Note:
Given array/list can contain duplicate elements. 
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= X <= 10^9
Time Limit: 1 sec
Sample Input 1:
1
9
1 3 6 2 5 4 3 2 4
7
Sample Output 1:
7
Sample Input 2:
2
9
1 3 6 2 5 4 3 2 4
12
6
2 8 10 5 -2 5
10
Sample Output 2:
0
2


 Explanation for Input 2:
Since there doesn't exist any pair with sum equal to 12 for the first query, we print 0.

For the second query, we have 2 pairs in total that sum up to 10. They are, (2, 8) and (5, 5).
 */

package Assignment;
import java.util.*;

public class PairSum {

	public static int pairSum(int arr[], int x) {
    	int count=0;
     for(int i=0;i<arr.length;i++){

         for(int j=i+1;j<arr.length;j++){

             if(arr[i]+arr[j]==x){
                 count++;
             }
         }
     }
         return count;
    }


    public static void main(String args[]){

      Scanner sc=new Scanner(System.in);

      int T= sc.nextInt();
      for(int j=1;j<=T;j++){
          int size=sc.nextInt();

          int arr[]=new int[size];
          for(int i=0;i<size;i++){
              arr[i]=sc.nextInt();
          }
          int x=sc.nextInt();

           pairSum(arr,x);
              
      }


    }
}
