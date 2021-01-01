package interview;

import java.util.ArrayList;
import java.util.Arrays;

//find min and max in array.
public class MinAndMax {

	public static void main(String[] args) {

		//By sort and index number
		int[] number = { 1, 5, 9, 15, 85, 14 };
		Arrays.sort(number);
		System.out.println("min " + number[0]+"max " + number[number.length - 1]);

		// using stream
		int min = Arrays.stream(number).min().getAsInt();
		int max = Arrays.stream(number).max().getAsInt();
		System.out.println(min+" and " +max);
	}

}
