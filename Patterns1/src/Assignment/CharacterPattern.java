/*
 Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 4
A
BC
CDE
DEFG
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 13
Sample Input 1:
5
Sample Output 1:
A
BC
CDE
DEFG
EFGHI
Sample Input 2:
6
Sample Output 2:
A
BC
CDE
DEFG
EFGHI
FGHIJK
 */

package Assignment;
import java.util.*;

public class CharacterPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

		char ch='A';

		for(int i=1;i<=n;i++){

			char var=ch;

			for(int j=1;j<=i;j++){

				System.out.print(var);
		          var=(char)(var+1);
			}
			ch=(char)(ch+1);
		System.out.println();
		} 

	}

}
