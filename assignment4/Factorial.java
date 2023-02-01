package week2.assignment4;

public class Factorial {
	public static void main(String[] args) {
		int input = 22;
		long factorial = 1;
		for(int i=1; i<=input;i++) {
			factorial = factorial*i;
			System.out.println(factorial);
		}
	}

}
