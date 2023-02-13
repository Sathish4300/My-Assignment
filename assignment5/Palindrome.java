package week3.assignment5;

public class Palindrome {
	public static void main(String[] args) {
		// declare the string
				String name1 = "racecar";
				// convert string into char
				char[] charArray = name1.toCharArray();
				// declare the empty string
				String name2 = "";
				// decrement the value
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

	



