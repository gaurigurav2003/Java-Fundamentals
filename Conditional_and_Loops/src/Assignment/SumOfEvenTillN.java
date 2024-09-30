/*
 Given a number N, print sum of all even numbers from 1 to N.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
 6
Sample Output 1 :
12
Sample Input 2 :
 7
Sample Output 2 :
12
 */




package Assignment;
import java.util.*;

public class SumOfEvenTillN {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

			 int sum=0;

			 int num=sc.nextInt();

			 for(int i=1;i<=num;i++){

				 if(i%2==0){
					 sum=sum+i;
				 }

			 }	
			 System.out.println(sum);

	}
}
