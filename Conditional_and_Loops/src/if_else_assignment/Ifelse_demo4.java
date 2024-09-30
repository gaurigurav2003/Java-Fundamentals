package if_else_assignment_0;

public class Ifelse_demo4 {

	public static void main(String[] args) {
		/*  write a java program that check a number from 0 to 5 and print its spelling, if number is greater
		 than 5 print the number is greater than 5 */
		
		int var=8;
		if(var<0) {
			System.out.println(var +" is less than 0");
		}else if(var==0) {
			System.out.println("Zero");
			
		}else if(var==1) {
			System.out.println("one");
			
		}else if(var==2) {
			System.out.println("two");
			
		}else if(var==3) {
			System.out.println("three");
			
		}else if(var==4) {
			System.out.println("four");
			
		}else if(var==5) {
			System.out.println("five");
			
		}else {
			System.out.println("the number is greater than 5");
		}

	}

}
