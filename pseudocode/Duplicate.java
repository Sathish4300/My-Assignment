package assignment.pseudocode;

public class Duplicate {
	public static void main(String[] args) {
		// declare the input
		int[] num = {11,22,33,44,55,66,22,77,11};
		// iterate the value in forward method
		for(int i=0;i<num.length;i++) {
			// iterate the value 
			for(int j=i+1;j<num.length;j++) {
				// check and compare the value
				if(num[i]==num[j]) {
					// print the duplicate element
					System.out.println("Found duplicate element is " +num[i]);
	}

}
		}
	}
}
