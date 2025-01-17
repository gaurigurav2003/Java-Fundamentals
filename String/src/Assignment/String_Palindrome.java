/*
 roblem statement
Given a string, determine if it is a palindrome, considering only alphanumeric characters.

Palindrome
A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
Example:
If the input string happens to be, "malayalam" then as we see that this word can be read the same as forward and backwards, it is said to be a valid palindrome.

The expected output for this example will print, 'true'.
From that being said, you are required to return a boolean value from the function that has been asked to implement.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1 :
abcdcba
Sample Output 1 :
true 
Sample Input 2:
coding
Sample Output 2:
false
 */

package Assignment;
import java.util.*;

public class String_Palindrome {

	public static boolean isPalindrome(String str) {
		String rev="";
boolean result=true;
		for(int i=0;i<str.length();i++){
			rev=str.charAt(i)+rev;
		}

		if(str.equals(rev)){
                 result=true; 
		}
		else{
		result=	false;
		}
		return result;
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean result= isPalindrome(str);
	}
}
