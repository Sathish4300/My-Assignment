package assignment.pseudocode;

public class Palindrome {
	public static void main(String[] args) {
		// declare the input as madam
		String name1 = "madam";
		// convert string into char
		char[] charArray = name1.toCharArray();
		// declare the empty string
		String name2 = "";
		// iterate the value in reverse order
		for(int i = charArray.length-1; i>=0; i--) {
			name2 = name2+charArray[i];
		}
			System.out.println(name2);
		// check the condition true or false	
		if(name1.equals(name2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
