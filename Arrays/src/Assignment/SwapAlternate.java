/*
 Problem statement
You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.

You don't need to print or return anything, just change in the input array itself.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1sec
Sample Input 1:
1
6
9 3 6 12 4 32
Sample Output 1 :
3 9 12 6 32 4
Sample Input 2:
2
9
9 3 6 12 4 32 5 11 19
4
1 2 3 4
Sample Output 2 :
3 9 12 6 32 4 11 5 19 
2 1 4 3
 */

package Assignment;
import java.util.*;

public class SwapAlternate {

	public static void swapAlternate(int arr[]) {
        int n=arr.length;
    	for(int i=0;i<arr.length;i++){
            if((n%2)!=0 ){
                if((n-1)==i){
                    return;
                }

            }
            int num=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=num;

           i++;

        }
        
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();

        for(int j=1;j<=T;j++){

            int size=sc.nextInt();

            int arr[]=new int[size];

            for(int i=0;i<arr.length;i++){

                arr[i]=sc.nextInt();
            }
              swapAlternate(arr);

        }
    }
}
