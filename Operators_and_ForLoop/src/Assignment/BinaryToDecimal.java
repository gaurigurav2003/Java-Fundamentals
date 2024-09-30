/*
 Problem statement
Given a binary number as an integer N, convert it into decimal and print.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7

 */

package Assignment;
import java.util.*;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=0;
int desi=0;
		int N=sc.nextInt();

		while(N!=0){

			int rem=N%10;
          N=N/10;
		  desi=desi+rem*(int)Math.pow(2,n);
		  n++;

		}
		System.out.println(desi);

	}
}
