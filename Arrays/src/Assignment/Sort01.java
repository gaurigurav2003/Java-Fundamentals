/*
 Problem statement
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.

Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
7
0 1 1 0 1 0 1
Sample Output 1:
0 0 0 1 1 1 1
Sample Input 2:
2
8
1 0 1 1 0 1 0 1
5
0 1 0 1 0
Sample Output 2:
0 0 0 1 1 1 1 1
0 0 0 1 1 
 */

package Assignment;
import java.util.*;

public class Sort01 {

	 public static void sortZeroesAndOne(int[] arr) {
    	 int left = 0;
        int i = 0;
        int right = arr.length - 1;
        
        while (i <= right) {
            if (arr[i] == 0) {
                // Swap arr[left] and arr[i]
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                
                left++;
                i++;
            } else {
                i++;
            }
        }
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
         

          sortZeroesAndOne (arr);
              
      }


    }
}
