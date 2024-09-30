/*
 Problem statement
Write a program to print N number of rows for Half Diamond pattern using stars and numbers

Note : There are no spaces between the characters in a single line.


Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
 */

package Assignment;
import java.util.*;

public class HalfDiamondPattern {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           

        int N=sc.nextInt();

        int n1=N;

        int n2=n1-1;
        if(N==0){
        System.out.println("*");
        System.out.println("*");
       return;
    }
    System.out.println("*");
             int col=0;
        for(int i=1;i<=2*N-1;i++){

                   if(i<=n1){
                        col=i;
                         
                   }else{
                         col=2*N-i;

                   }
                      System.out.print("*");
                   for(int j=1;j<=col;j++){
                       System.out.print(j);
                   }
                   for(int j=col-1;j>=1;j--){
                       System.out.print(j);
                   }
                   System.out.print("*");
                      System.out.println();
        }   
        System.out.println("*");

    }
}
