package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

//find min and max in array.
public class MinAndMax {

	public static void main(String[] args) {

		//By sort and index number
		//int[] number = { 1, 5, 9, 15, 85, 14 };
		//Arrays.sort(number); 
		//System.out.println(Arrays.toString(number));
		//System.out.println("2 min " + number[5]+"max " + number[number.length - 1]);

		// using stream
		//int min = Arrays.stream(number).min().getAsInt();
		//int max = Arrays.stream(number).max().getAsInt();
		//int min= Arrays.stream(number).min().getAsInt();
		
		//System.out.println(min);
		// how we find a random number true or false or that number exits or not?int qestion 2/18/21
		//boolean contains = IntStream.of(number).anyMatch(a -> a==9);
		//System.out.println(contains);
		
		//or
		int[] number = { 1, 5, 9, 15, 85, 14 };
		boolean result = false;
		for (int check:number) {
			if (check == 9) {
				result = true;
				}
			}
	     	System.out.println(result);
	                 }
}
