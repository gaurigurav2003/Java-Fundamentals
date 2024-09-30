/*
 Problem statement
For a given string(str), remove all the consecutive duplicate characters.

Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aabccbaa
Sample Output 1:
abcba
Sample Input 2:
xxyyzxx
Sample Output 2:
xyzx
 */

package Assignment;
import java.util.*;


public class Remove_Consecutive_Duplicate {
	public static String removeConsecutiveDuplicates(String str) {
        int n=str.length();

char arr1[]=str.toCharArray();
String str1="";
char curr=str.charAt(0);
str1=str1+curr;

for(int i=1;i<n;i++){

	char prev =str.charAt(i);

	if(prev != curr){
 str1=str1+prev;

	}
	else{
		continue;
	}
	curr=prev;
}    
return str1;
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

String str=sc.nextLine();

String newstr=removeConsecutiveDuplicates(str);
}
}
