package Week2.day3;

public class Calculator {
	public void addTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
		}
	
	public void subTwoNumber(int e,int f) {
		int d=e-f;
		System.out.println(d);
	}
	
	public void multipleTwoNumber(double i , double j) {
		double g=i*j;
		System.out.println(g);
	}
	
	public void divisionTwoNumber(float x,float y) {
		float z=x/y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Calculator calculator =new Calculator();
		calculator.addTwoNumber(30, 40);
		 calculator.subTwoNumber(50, 26);
		 calculator.multipleTwoNumber(35.3, 56.6);
		 calculator.divisionTwoNumber(300.7F, 500.8F);
	}

}
