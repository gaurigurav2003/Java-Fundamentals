/*
 Problem statement
Print the following pattern for the given number of rows.

Note: N is always odd.


Pattern for N = 5

The dots represent spaces.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
 */

package Assignment;
import java.util.*;


public class DiamondOfStars {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
            
            int n1=(N+1)/2;//4
            int n2=n1-1;//3
        for(int i=1;i<=n1;i++){

            for(int j=1;j<=n1-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+"");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("*"+"");
            }
            System.out.println();
              
        }

         for(int i=1;i<=n2;i++){

             
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=2 * (n2 - i + 1) - 1;j++){
                System.out.print("*"+"");
            }
         
          
            System.out.println();




         }
    }
}
