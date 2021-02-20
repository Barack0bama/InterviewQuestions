package interview;

import java.util.Scanner;

//check if a given number in palindrome.
//a word, phrase, or sequence that reads the same backward as forward
//such as madam, racecar
public class Palindrome {
	public static void main(String[] args) {
		/*
		 * System.out.println("Please enter a word "); Scanner sc = new
		 * Scanner(System.in); String original = sc.next();
		 */
		String original = "mom";
		String reverse = "";
		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse += original.charAt(i);

		if (original.equals(reverse))
			System.out.println("The string is a palindrome.");
		else
			System.out.println("The string isn't a palindrome.");
	}
}
