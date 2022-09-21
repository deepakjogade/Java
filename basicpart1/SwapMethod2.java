package basicjava;

public class SwapMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		
		a = 10;
		b = 20;
		
		System.out.print("\nBefore Swapping : ");
		System.out.print(a + " "+ b);
		
		a= a+b;
		b= a-b;
		a= a-b;
		
		
		System.out.print("\nAfter Swapping : ");
		System.out.print(a + " "+ b);
	}

}
