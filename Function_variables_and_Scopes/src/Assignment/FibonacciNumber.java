/*
 Problem statement
Create a function that determines whether a given number N belongs to the Fibonacci sequence. If N is found in the Fibonacci sequence, the function should return true; otherwise, it should return false.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Explanation :
Fibonacci sequence begins 0, 1, 1, 2, 3, 5, ... and so on. Since 5 appears in the sequence.
Sample Input 2 :
14
Sample Output 2 :
false
 */

package Assignment;
import java.util.*;


public class FibonacciNumber {

	public static boolean checkMember(int n){
		
		int num1=0;
		int num2=1;

		int curr=0;
		if(curr==n)
		return true;

		for(int i=1;i<=n;i++){

			curr=num1+num2;
			num1=num2;
			num2=curr;

			if(curr==n){
				return true;
			}
		}
		return false;

	}
}
