/*
 Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 3
 A
 BB
 CCC
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 26
Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
Sample Input 2:
6
Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF
 */

package Assignment;
import java.util.*;

public class AlphaPattern {
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);

		 int n=sc.nextInt();

		 char ch='A';

		 for(int i=1;i<=n;i++){

			 for(int j=1;j<=i;j++){
                 
                  System.out.print(ch);
			 }

			 ch=(char)(ch+1);
			 System.out.println();
		 }
		
	}

}
