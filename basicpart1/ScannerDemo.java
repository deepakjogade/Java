package basicjava;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n;
		n= a.nextInt();
		
		System.out.println("The given number : "+ n);
		a.close();
		
		

	}

}
