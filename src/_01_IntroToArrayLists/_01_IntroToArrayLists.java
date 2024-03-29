package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
		names.add("bob");
		names.add("steve");
		names.add("ian");
		names.add("ariel");
		names.add("francesca");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names);
		}
		
		//4. Print all the Strings using a for-each loop
		for (String s : names) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for (int z = 0; z < names.size(); z++) {
			if (z%2==1) {
				System.out.println(names.get(z));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = names.size()-1; i >= 0; i--) {
			System.out.println(names.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).contains("e")) {
				System.out.println(names.get(i));
			}
		}
	}
}
