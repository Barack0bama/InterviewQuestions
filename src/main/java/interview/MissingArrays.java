package interview;

//find missing number in array.
public class MissingArrays {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 6, 7 };

		int a = numbers.length;
		int b = a * ((a + 1) / 2);
		int c = 0;
		for (int i : numbers) {
			c += i;
		}
		System.out.print(c - b);
		
	}

}
