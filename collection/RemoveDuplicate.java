package assignment.collection;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String txt = "We learn java basics as part of java session in java week1";
		String[] split = txt.split(" ");
		//System.out.println(split);
		Set<String> word = new TreeSet<String>();
		for(int i=0;i<split.length;i++) {
			word.add(split[i]);
		}
		System.out.print(word);
	}

}
