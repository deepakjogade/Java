package basicjava;

public class Swapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, t;
		
		a = 10;
		b = 20;
		
		System.out.print("\nBefore Swapping : ");
		System.out.print(a + " "+ b);
		
		t=a;
		a=b;
		b=t;
		
		
		System.out.print("\nAfter Swapping : ");
		System.out.print(a + " "+ b);
	}

}
