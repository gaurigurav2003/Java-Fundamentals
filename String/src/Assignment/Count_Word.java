/*
 Problem statement
For a given input string(str), find and return the total number of words present in it.

It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 sec
Sample Input 1:
Coding Ninjas!
Sample Output 1:
2
Sample Input 2:
this is a sample string
Sample Output 2:
5

 import java.util.*;
import java.util.Scanner;
import java.util.StringTokenizer.*;
 public class Solution {

	public static int countWords(String str) {	
		StringTokenizer obj=new StringTokenizer(str," ");

		int count=obj.countTokens();


 */

package Assignment;
import java.util.*;
import java.util.StringTokenizer.*;

public class Count_Word {
	public static int countWords(String str) {	
		StringTokenizer obj=new StringTokenizer(str," ");

		int count=obj.countTokens();
		return count;
	}

	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);

	String str=sc.nextLine();

	countWords(str);

}
	
}
