package com.skillstorm.strings;

public class DryStrings {

	public static void main(String[] args) {
		String[] str = {"This is a series of Strings",
				"That will be sent together to our DRY method",
				"This was tedious to write before..."};
		printDryStrings(str);
		printDryString("This is a single String");
	}
	
	public static void printDryStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			printDryString(strings[i], i);
		}
	}
	
	public static void printDryString(String string) {
		System.out.format("Printing a single String: %s", string);					
	}
	
	public static void printDryString(String string, int position) {
		System.out.format("The value of str[%d] is: %s\n", position, string);					
	}
}
