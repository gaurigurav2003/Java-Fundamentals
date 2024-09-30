/*
 Print the following pattern for the given N number of rows.

Pattern for N = 3
###
###
###
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 50
Sample Input1:
5
Sample Output 1:
#####
#####
#####
#####
#####
Sample Input 2:
4
Sample Output 2:
####
####
####
####
 */

package Assignment;
import java.util.*;

public class GameOfPattern {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		for(int i=1;i<=n;i++){

			for(int j=1;j<=n;j++){

				System.out.print("#");


			}
			System.out.println();
			
		} 
	}
}
