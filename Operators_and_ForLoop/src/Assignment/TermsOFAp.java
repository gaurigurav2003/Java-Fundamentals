/*
 Problem statement
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17
Explanation :
Input is 4 and print the first 4 numbers that are not divisible by 4 and are of the form 3N + 2, where k is a non-negative integer.
 */

package Assignment;
import java.util.*;


public class TermsOFAp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int X=sc.nextInt();

		             int num=1;
	                int var=0;
					 for(int i=1;i<=X;i++){

	                     if(((3*num)+2)%4!=0){
						var	 =3*num+2;
							 System.out.print(var+" ");
							 num++;
						 }
						 else if((num%2==0)&&((3*num)+2)%4==0){
							 //var=var+6
							// System.out.print(var);
							i--;
							 num++;
						 }

					 }

		}
}
