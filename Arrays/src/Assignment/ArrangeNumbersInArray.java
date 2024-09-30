/*
 Problem statement
You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.

Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.



Note:
You need not print the array. You only need to populate it.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^4

Time Limit: 1sec
Sample Input 1 :
1
6
Sample Output 1 :
1 3 5 6 4 2
Explanation of Sample Input 1 :
Since the value of N is 6, the number will be stored in the array in such a fashion that 1 will appear at 0th index, then 2 at the last index, in a similar fashion 3 is stored at index 1. Hence the array becomes 1 3 5 6 4 2.
Sample Input 2 :
2
9
3
Sample Output 2 :
1 3 5 7 9 8 6 4 2
1 3 2
 */

package Assignment;
import java.util.*;

public class ArrangeNumbersInArray {

	  public static void arrange(int[] arr, int n) {
          int ptr1=0;
          int ptr2=n-1;
          int temp[]=new int[n];
          int num=1;
        Scanner s=new Scanner(System.in);

          for(int i=0;i<n;i++){
          
           temp[i]=num;//dont take input from user
           num++;

          }
                for(int i=0;i<n;i++){
                   int var=temp[i];
              
                if(var%2!=0){
                         arr[ptr1]=var;
                         ptr1++;

                }
               
                else {
                    arr[ptr2]=var;
                    ptr2--;
                }


          }
       

     

}


public static void main(String args[]){

    Scanner sc=new Scanner(System.in);

    int T=sc.nextInt();

    for(int j=1;j<=T;j++){

              int size=sc.nextInt();

              int arr[]=new int[size];

              arrange(arr,size);

           
    }
   
}
}
