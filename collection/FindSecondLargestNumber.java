package assignment.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestNumber {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> number = new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			number.add(data[i]);
		}
		System.out.println(number);
		List<Integer> num = new ArrayList<Integer>(number);
		System.out.println(num.get(num.size()-2));

	}

}
