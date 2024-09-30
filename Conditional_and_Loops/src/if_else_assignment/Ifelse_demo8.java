package if_else_assignment_0;

public class Ifelse_demo8 {

	public static void main(String[] args) {
		/* write a program to check day number and print the corresponding day of week */
               int week_no=8;
               
               if(week_no<=0 || week_no>7) {
            	   System.out.println("invalid week");
               }else if(week_no==1) {
            	   System.out.println("monday");
               }else if(week_no==2) {
            	   System.out.println("tuesday");
               }else if(week_no==3) {
            	   System.out.println("wed");
               }else if(week_no==4) {
            	   System.out.println("thurs");
               }else if(week_no==5) {
            	   System.out.println("fri");
               }else if(week_no==6) {
            	   System.out.println("sat");
               }else if(week_no==7) {
            	   System.out.println("sun");
               }
	}

}
