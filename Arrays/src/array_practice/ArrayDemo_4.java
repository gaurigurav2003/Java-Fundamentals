package array_1;
import java.util.*;

public class ArrayDemo_4 {

	public static void main(String[] args) {
		// write a program ,take 7 characters as an input, print only vowels from from 
		// the array
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter size ");
		
		int size=obj.nextInt();//7
		obj.nextLine();
        char arr[]=new char[size];
        System.out.println("enter the no of characters");
        
        for(int i=0;i<arr.length;i++) {
        	arr[i]=obj.nextLine().charAt(0);
        	
        }
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
        		System.out.print(arr[i]);
        	}
        }
		

	}

}
