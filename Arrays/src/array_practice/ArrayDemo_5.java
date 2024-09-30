package array_1;
import java.io.*;


public class ArrayDemo_5 {

	public static void main(String[] args)throws IOException {
		// write a program ,take 7 characters as an input, print only vowels from from 
				// the array
				
				BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("enter size ");
				
				int size=Integer.parseInt(obj.readLine());//7
				
		        char arr[]=new char[size];
		        System.out.println("enter the no of characters");
		        
		        for(int i=0;i<arr.length;i++) {
		        	arr[i]=obj.readLine().charAt(0);
		        	
		        }
		        
		        for(int i=0;i<arr.length;i++) {
		        	if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
		        		System.out.print(arr[i]);
		        	}
		        }
				


	}

}
