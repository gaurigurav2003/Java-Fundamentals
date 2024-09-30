package if_else_assignment_0;

public class Ifelse_demo5 {

	public static void main(String[] args) {
		/*  write a java program, in which according to month no print the no. of days in that month */
        int month=-6;
        
        if(month<=0||month>12) {
        	System.out.println("invalid month");
        }else if(month==1) {
        	System.out.println("jan has 31 days");
        }else if(month==2) {
        	System.out.println(" feb has 28 or 29 days");
        }else if(month==3) {
        	System.out.println(" march has 31 days");
        }else if(month==4) {
        	System.out.println("april has 30 days");
        }else if(month==5) {
        	System.out.println(" may has 31 days");
        }else if(month==6) {
        	System.out.println("june has 30 days");
        }else if(month==7) {
        	System.out.println("july has 31 days");
        }else if(month==8) {
        	System.out.println("aug has 31 days");
        }else if(month==9) {
        	System.out.println("sept has 30 days");
        }else if(month==10) {
        	System.out.println("oct has 31 days");
        }else if(month==11) {
        	System.out.println(" nov has 30 days");
        }else if(month==12) {
        	System.out.println(" dec has 31 days");
        }
	}

}
