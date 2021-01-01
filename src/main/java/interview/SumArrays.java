package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class SumArrays {
	 //find sum of array
	public static void main(String[] args) {
		
		// This is using list and stream method
		List <Integer> numbers = Arrays.asList(1,5,7,9,10);
		Integer sum = numbers.stream().mapToInt(e -> e).sum();
		System.out.println(sum);
		
		
		// This is using reg array
		int numbers2 [] = {1,5,6,9,10};
		int sum2 = IntStream.of(numbers2).sum();
		System.out.println(sum2);

	}

}
