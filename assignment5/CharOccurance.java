package week3.assignment5;

public class CharOccurance {
	public static void main(String[] args) {
		// declare the string
				String txt = "Hexaware";
				// convert string into array
				char[] charArray = txt.toCharArray();
				// initialize the count variable is 0
				int count = 0;
				// iterate the character
				for(int i=0;i<=charArray.length;i++) {
					// check the loop condition                                    
				if(charArray[i]=='e') {
				count++;
				System.out.println("e is " + count);
					}
				}
	}

}
