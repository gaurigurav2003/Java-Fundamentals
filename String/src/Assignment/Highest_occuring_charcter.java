/*
 Problem statement
For a given a string(str), find and return the highest occurring character.

Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.

Consider:
Assume all the characters in the given string to be in lowercase always.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x
 */

package Assignment;
import java.util.*;

public class Highest_occuring_charcter {

	public static char highestOccuringChar(String str) {
        
		  int freq[]=new int[256];
      char carr1[]=str.toCharArray();
		  for(char ch:carr1){
			  freq[ch]++;
		  }
		  int max=0;
		  char var=carr1[0];

		  for(int i=0;i<freq.length;i++){
               if(freq[i]>max){
					 max=freq[i];
					 var=(char)i;
				 }

		  }

       return var;



		
	}
public static void main(String args[]){

	Scanner sc=new Scanner(System.in);

	String str=sc.nextLine();

	char newstr=highestOccuringChar(str);
	System.out.println(newstr);
}
}
