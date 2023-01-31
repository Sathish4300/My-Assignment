package week2.assignment3;

public class Calculator {
	public void add(int a,int b) {
		int c = a+b;
		System.out.println(c);
		
	}
	public void sub(int e,int f) {
		int d = e-f;
		System.out.println(d);
		
	}
	public void mul(double i,double j) {
		double h = i*j;
		System.out.println(h);
		
	}
	public void div(float x,float y) {
		float z = x/y;
		System.out.println(z);
		
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(43, 47);
		cal.sub(56, 90);
		cal.mul(67.89, 45.34);
		cal.div(45.6f, 32.7f);
	}

}
