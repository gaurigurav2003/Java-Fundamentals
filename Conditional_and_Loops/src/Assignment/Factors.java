/*
 Write a program that takes a number as input and prints all its factors except 1 and the number itself.. If the number has only two factors (1 and the number itself), then the program should print -1.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= n <= 10,000
Sample Input 1 :
8
Sample Output 1 :
2 4
Explanation of Sample Output 1 :
The factors for the number excluding 1 and itself are 2 and 4, so the output is 2 4.
Sample Input 2 :
11
Sample Output 2 :
-1
Explanation of Sample Output 2 :
11 is a prime number having factors 1 and 11 so that output will be -1.
 */





package Assignment;
import java.util.*;

public class Factors {
	 
	    public static void main(String[] args) {
	     
	      Scanner sc=new Scanner(System.in);

	      int num=sc.nextInt();//8
	             int count=2;
	         for(int i=2;i<num;i++){

	             if(num%i==0){
	                       System.out.print(i+" ");
	                       count++;
	             }
	         }
	         if(count==2){
	                System.out.println(-1);
	         }
	        
	    
	}
}
