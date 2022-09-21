package basicjava;

public class SimpleConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=56.50;
		int a = (int) n;
		double p = (n-a) * 100;
		System.out.println("Rs : "+a);
		System.out.println("paise : "+(int)p);
	}

}
