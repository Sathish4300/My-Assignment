package assignment.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {
		String[] companyName = {"Wipro","HCL","Aspire Systems","CTS"};
		List<String> company = new ArrayList<String>();
		for (int i = 0; i < companyName.length; i++) {
			company.add(companyName[i]);
		}
		System.out.println(company);
		Collections.sort(company);
		System.out.println(company);
		Collections.reverse(company);
		System.out.println(company);
		
		
	}

}
