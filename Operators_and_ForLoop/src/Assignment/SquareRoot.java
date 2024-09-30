/*
  Problem statement
Given a number N, find its square root. You need to find and print only the integral part of square root of N.

For eg. if number given is 18, answer is 4.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^8
Sample Input 1 :
10
Sample Output 1 :
3
Sample Input 2 :
4
Sample Output 2 :
2

 */

package Assignment;
import java.util.*;

public class SquareRoot {
	
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);

			int N=sc.nextInt();
	         long ans=0;
			 int n=0;
			while(N!=0){

				int rem=N%2;
				N=N/2;

				ans=ans+rem*(long)Math.pow(10,n);
				n++;
			}
			System.out.println(ans);

		}
	}



