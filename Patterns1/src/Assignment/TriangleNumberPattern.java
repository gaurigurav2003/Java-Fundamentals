/*
 Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 4
1
22
333
4444
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
22
333
4444
55555
Sample Input 2:
6
Sample Output 2:
1
22
333
4444
55555
666666
 */

package Assignment;
import java.util.*;

public class TriangleNumberPattern {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
		  for(int i=1;i<=n;i++){

			   for(int j=1;j<=i;j++){

				   System.out.print(i);
			   }
	               System.out.println();

		  }

	}

}
