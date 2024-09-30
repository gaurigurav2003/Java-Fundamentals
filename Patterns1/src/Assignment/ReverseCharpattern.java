/*
 Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 5
E
ED
EDC
EDCB
EDCBA
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 50
Sample Input 1:
7

Sample Output 1:
G
GF
GFE
GFED
GFEDC
GFEDCB
GFEDCBA
Sample Input 1:
6
Sample Output 1:
F
FE
FED
FEDC
FEDCB
FEDCBA
 */

package Assignment;
import java.util.*;

public class ReverseCharpattern {
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
        for(int i=1;i<=n;i++){

               char ch=(char)('A'+n-1);
			 for(int j=1;j<=i;j++){
				 System.out.print(ch);
				 ch=(char)(ch-1);
			 }
			 System.out.println();
		 }

	}

}
