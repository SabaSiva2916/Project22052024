package org.sam;

import java.util.ArrayList;
import java.util.List;

public class Helloworld {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		// Reverse of String
		String str = "Hello World";
		String output = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			output = output + c;
		}
		System.out.println("Reverse of given String :" + output);

		List<String> st = new ArrayList<>();
		st.add("java");
		st.add("selenium");
		st.add("python");
		st.add("apitesting");
		st.add("mobiletesting");
		st.add("cypress");

		// iterating List
		for (String s : st) {
			System.out.println(s);
		}

	}

}
