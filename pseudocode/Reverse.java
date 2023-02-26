package assignment.pseudocode;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		// scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name ");
		// declare the input via console
		String a = scanner.nextLine();
		// convert string text into char
		char[] charArray = a.toCharArray();
		// iterate the value in reverse  method
		for(int i=charArray.length-1;i>=0;i--) {
			// print the value
			System.out.print(charArray[i]);
		}
	}

}
