package basicjava;

class PublicConstant{
	
	public static final int NUMBER_Of_MONTH= 12;
	public static final double PI = (double) 22/7;
}

public class ConstantDemo {
	
	static final int NUMBER_Of_MONTHS= 12;
	static final double Pi = (double) 22/7;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("NUMBER_OF_MONTHS : " + NUMBER_Of_MONTHS);
		System.out.println("PI : "+Pi);
		
		System.out.println("NUMBER_OF_MONTHS : " + PublicConstant.NUMBER_Of_MONTH);
		System.out.println("PI : "+PublicConstant.PI);
			
	}

}
