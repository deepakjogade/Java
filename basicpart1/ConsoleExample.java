package basicjava;

import java.io.*;

public class ConsoleExample {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Console c = System.console();
		int n;
		
		System.out.print("Enter a Number : ");
		
		n = Integer.parseInt(c.readLine());
		
		System.out.println("The Given number : " + n);
		
	}

}
