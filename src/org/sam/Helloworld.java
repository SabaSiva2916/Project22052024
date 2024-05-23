package org.sam;

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
	}

}
