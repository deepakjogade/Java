package basicPart1;
import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input a Number : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(a+" x "+i+" = "+a*i);
		}
		scanner.close();
	}

}
