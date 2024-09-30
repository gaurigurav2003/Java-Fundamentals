/*
 Problem statement
Print the following pattern for the given number of rows.

Pattern for N = 4

The dots represent spaces.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
          232
         34543
        4567654
       567898765
Sample Input 2:
4
Sample Output 2:
           1
          232
         34543
        4567654
 */

package Assignment;
import java.util.*;

public class TriangleOfNumbers {
	
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);

		 int n=sc.nextInt();

		 for(int i=1;i<=n;i++){

			 for(int j=1;j<=n-i;j++){
				 System.out.print(" "+"");
			 }
			 int p=i;
			 for(int j=1;j<=i;j++){
				 System.out.print(p);
				 p++;
			 }
			 p=p-2;
			 int var=p;
			 for(int j=1;j<=i-1;j++){
				 System.out.print(var+"");
				 var--;

			 }
			 p++;
			 p=p*2;
			 System.out.println();
		 }

		}

}
