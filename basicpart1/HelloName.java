package basicPart1;
import java.util.Scanner;

public class HelloName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your Name :");
		String name = scanner.nextLine();
		System.out.println("Hellow,\n"+name);
		scanner.close();
	}

}
