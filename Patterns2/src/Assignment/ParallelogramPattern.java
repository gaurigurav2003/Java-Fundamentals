/*
 Problem statement
Write a program to print parallelogram pattern for the given N number of rows.

For N = 4

The dots represent spaces.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
***
 ***
  ***
Sample Input 2 :
5
Sample Output 2 :
*****
 *****
  *****
   *****
    *****
 */

package Assignment;
import java.util.*;


public class ParallelogramPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          int N=sc.nextInt();
		for(int i=1;i<=N;i++){

              for(int j=1;j<i;j++){
                 System.out.print(" "+"");

			  }
			  for(int j=1;j<=N-i+1;j++){
				  System.out.print("*");
			  }
            for(int j=1;j<i;j++){
				System.out.print("*");
			}

			  System.out.println();

		}

	}
}
