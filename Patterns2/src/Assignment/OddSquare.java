/*
 Problem statement
Write a program to print the pattern for the given N number of rows.

For N = 4

1357
3571
5713
7135
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
 */

package Assignment;
import java.util.*;


public class OddSquare {

	 public static void main(String args[]){

         Scanner sc=new Scanner(System.in);

         int N=sc.nextInt();//4
         int count=1;
        
      for(int i=1;i<=N;i++){

                int var=count;
             for(int j=N;j>=i;j--){

                 System.out.print(var);
                 var+=2;
             }
            // System.out.println();
             count+=2;
             int num=1;
          for(int j=1;j<=i-1;j++){
            //  int num=j;
              System.out.print(num);
              num+=2;
          }
          System.out.println();

             }
     }
}
