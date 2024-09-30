/*
 Problem statement
Given a decimal number (integer N), convert it into binary and print.

Note for C++ coders:
Do not use the inbuilt implementation of "pow" function. The implementation of that function is done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for non-float data types. 
The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java. 


Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^5
Sample Input 1 :
12
Sample Output 1 :
1100
Sample Input 2 :
7
Sample Output 2 :
111
Sample Input 2 :
0
Sample Output 2 :
0
 */

package Assignment;
import java.util.*;


public class DecimalToBinary {
		
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


