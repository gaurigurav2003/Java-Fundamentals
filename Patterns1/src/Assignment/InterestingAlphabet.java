/*
 Problem statement
Print the following pattern for the given number of rows.

Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
 */

package Assignment;
import java.util.*;

public class InterestingAlphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

		char ch=(char)('A'+n-1);

		for(int i=1;i<=n;i++){

			char var=ch;

			for(int j=1;j<=i;j++){

				System.out.print(var);
		          var=(char)(var+1);
			}
			ch=(char)(ch-1);
		System.out.println();
}

	}

}
