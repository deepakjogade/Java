package basics1;
import java.util.Scanner;

public class DeciToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to convert to binary");
		int num = sc.nextInt();
		
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toHexString(num));
		System.out.println(Integer.toOctalString(num));
		
//		System.out.println(Integer.toBinaryString(10));  
//		System.out.println(Integer.toBinaryString(21));  
//		System.out.println(Integer.toBinaryString(31));
		sc.close();
	}

}  
