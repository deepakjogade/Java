package basicjava;

public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area, a, b, c, s;
		
		a=3;
		b=4;
		c=5;
		
		s = (a + b + c) / 2;
		
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("\nArea of Triangle is = "+ area);
	}

}
