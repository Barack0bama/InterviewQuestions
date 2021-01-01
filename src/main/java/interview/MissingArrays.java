package interview;

import java.util.ArrayList;

//find missing number in array.
public class MissingArrays {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 3, 4, 6, 7 };

		int total_num = numbers.length;
		int expected_num_sum = total_num * ((total_num + 1) / 2);
		int num_sum = 0;
		for (int i : numbers) {
			num_sum += i;
		}
		System.out.print(num_sum - expected_num_sum);
		System.out.print("\n");
	}

}
