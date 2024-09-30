/*
 Problem statement
For a given input string(str), write a function to print all the possible substrings.

Substring
A substring is a contiguous sequence of characters within a string. 
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abc
Sample Output 1:
a 
ab 
abc 
b 
bc 
c 
 Sample Input 2:
co
Sample Output 2:
c 
co 
o
 */

package Assignment;
import java.util.*;

public class All_Substring {

	public static void printSubstrings(String str) {
		int count=str.length();

		for(int i=0;i<count;i++){

			int num=i;

			for(int j=i+1;j<=count;j++){

				System.out.println(str.substring(num, j));
			}
		}
	}

	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
       printSubstrings(str);

	}
}