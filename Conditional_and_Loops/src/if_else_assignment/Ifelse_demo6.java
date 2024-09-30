package if_else_assignment_0;

public class Ifelse_demo6 {

	public static void main(String[] args) {
		// write a program to find a maximum between three numbers
		
		int num1=2;
		int num2=42;
		int num3=42;
		 if(num1>num2 && num1>num3) {
			 System.out.println(num1 + " num1 is a  greater");
		 }else if(num2>num1 && num2>num3) {
			 System.out.println(num2 + " num2 is a greater");
		 }else if(num3>num1 && num3>num2) {
			 System.out.println(num3 + " num3 is a greater");
		 }else if(num1>num2 && num1==num3) {
			 System.out.println(num1 + " i.e num1 is greater than num2 but equal to num3 i.e "+ num3);
		 }else if(num2>num1 && num2==num3) {
			 System.out.println(num2 + " i.e num2 is greater than num1 but equal to num3 i.e "+num3);
		 }else if(num2>num3 && num2==num1) {
			 System.out.println(num2 + " i.e num2 is greater than num3 but equal to num1 i.e"+ num1);
		 }else {
			 System.out.println("all numbers are equal");
		 }
		//. .
		// -
		

	}}
