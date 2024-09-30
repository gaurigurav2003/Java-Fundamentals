/*
 Problem statement
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N < 10^8
Sample Input 1 :
1234
Sample Output 1 :
4321
Sample Input 2 :
1980
Sample Output 2 :
891
 */

package Assignment;
import java.util.*;

public class ReverseOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int rev=0;

		int N=sc.nextInt();

		while(N!=0){

			int rem=N%10;
			
			N=N/10;
			rev=rev*10+rem;

		}
		System.out.println(rev);
		}
}
