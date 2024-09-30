/*
 Problem statement
Print the following pattern

Pattern for N = 4

Hint
As taught in the video, you just have to modify the code so that instead of printing numbers, it should output stars ('*').
The dots represent spaces.




Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
 */

package Assignment;
import java.util.*;

public class StarPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		for(int i=1;i<=n;i++){
                         
						 for(int j=1;j<=n-i;j++){

							 System.out.print(" "+"");
						 }
						 for(int j=1;j<=i;j++){
							 System.out.print("*"+"");
						 }
						 for(int j=1;j<=i-1;j++){
							 System.out.print("*"+"");
						 }
						 System.out.println();

		}
	

		
	}
}
