package assignment.pseudocode;

public class MissingElement {
	public static void main(String[] args) {
		// declare the input
		int[] num ={2,5,6,8,9,1,3,4};
		// declare the sum1 variable 0
		int sum1 = 0;
		// iterate the value in forward method
		for(int i=0;i<num.length;i++) {
			sum1 =  sum1+num[i];
		}
		System.out.println(sum1);
		// declare the sum2 variable 0
		int sum2=0;
		// iterate the value in forward method
		for(int i=1;i<=9;i++) {
			sum2 = sum2+i;
		}
		System.out.println(sum2);
		// find the missing element
		System.out.println("Missing number is " + (sum2-sum1));
		
	}

}
