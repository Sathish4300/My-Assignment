package week3.assignment5;

public class ReverseOddNumbers {
	public static void main(String[] args) {
		String txt = "I am a software engineer";
		String[] split = txt.split(" ");
		for(int i=0;i<=split.length;i++) {
			if(i%2==1) {
				char[] charArray = split[i].toCharArray();
				for (int j=charArray.length-1;j>=0;j--) {
					System.out.print(charArray[j]);
				}
				
			}else {
				
				System.out.print(" ");
				System.out.print(split[i]+" ");
			}
		}
	}

}
