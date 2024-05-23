package org.sam;

import java.util.ArrayList;
import java.util.List;

public class Helloworld {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		List<String> str = new ArrayList<>();
		str.add("java");
		str.add("selenium");
		str.add("python");
		str.add("apitesting");
		str.add("mobiletesting");
		str.add("cypress");

		// iterating List
		for (String s : str) {
			System.out.println(s);
		}
	}

}
