package basicPart1;

import java.util.Scanner;

public class Math2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int First_num=scanner.nextInt();
		System.out.print("Enter Second Number : ");
		int Second_num=scanner.nextInt();
		
		System.out.println(First_num+ " + "+Second_num+" = "+(First_num+Second_num));
		System.out.println(First_num+ " - "+Second_num+" = "+(First_num-Second_num));
		System.out.println(First_num+ " x "+Second_num+" = "+First_num*Second_num);
		System.out.println(First_num+ " / "+Second_num+" = "+First_num/Second_num);
		System.out.println(First_num+ " % "+Second_num+" = "+First_num%Second_num);
		
		scanner.close();
	}

}
