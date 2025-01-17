/*
 Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 4

The dots represent spaces.

Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 50
Sample Input 1:
3
Sample Output 1:
      1 
    12
  123
Sample Input 2:
4
Sample Output 2:
      1 
    12
  123
1234
 */

package Assignment;
import java.util.*;

public class MirrorNumberPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		for(int i=1;i<=n;i++){

			for(int j=1;j<=n-i;j++){
                   System.out.print(" "+"");
			}

			for(int j=1;j<=i;j++){
				System.out.print(j+"");
			}
			System.out.println();
		}
	
		
	}
}
