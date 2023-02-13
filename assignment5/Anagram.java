package week3.assignment5;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String txt1 = "tabelt";
		String txt2 = "battle";
		char[] charArray1 = txt1.toCharArray();
		char[] charArray2 = txt2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		boolean equal = Arrays.equals(charArray1, charArray2);
		if(equal) {
			System.out.println(txt1 + " and " + txt2 + " are anagram");
		}
		else {
			System.out.println(txt1 + " and " + txt2 + " are not anagram");
		}
	}

}
