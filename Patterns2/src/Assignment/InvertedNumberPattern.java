/*
 Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 4
4444
333
22
1
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
55555 
4444
333
22
1
Sample Input 2:
6
Sample Output 2:
666666
55555 
4444
333
22
1
 */

package Assignment;
import java.util.*;

public class InvertedNumberPattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
                   int num=n;
				 int count=num;
		for(int i=1;i<=n;i++){
                
			for(int j=n;j>=i;j--){
                  System.out.print(count);
			}
			count--;
			System.out.println();
		}

		
	}
}
