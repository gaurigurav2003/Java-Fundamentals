package if_else_assignment_0;

public class Ifelse_demo9 {

	public static void main(String[] args) {
		//whether check three numbers are in pythagorean triplet
		
		int a=1;
		int b=6;
		int c=9;
		
		if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b) {
			System.out.println("its pythagorean triplet");
		}else {
			System.out.println("not in pythagorean triplet");
		}

	}

}
