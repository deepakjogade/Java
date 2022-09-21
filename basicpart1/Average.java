package basicPart1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three Numbers :");
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		int c= scanner.nextInt();
		
		int n=3;
		
		System.out.println("The Average of "+a+", "+b+"& "+c+" is "+(a+b+c)/n);
		scanner.close();
	}

}
