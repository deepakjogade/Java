package basicjava;

public class SumConsole {

	public static void main(String[ ] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum;
		
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		
		sum = num1 + num2;
		
		System.out.println(" Sum = "+ sum);
	}

}
