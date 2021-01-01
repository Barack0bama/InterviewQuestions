package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Remove duplicates and print based on given conditions
public class Duplicates {

	public static void main(String[] args) {
		// Find only those that has 4 letters
		List<String> words = Arrays.asList("Yellow", "Green", "Teal", "Red", "Yellow", "Red", "Blue", "Pink", "Gold",
				"Blue");
		List<String> result = words.stream().filter(word -> word.length() == 4).collect(Collectors.toList());
		System.out.println(result);

		// Remove duplicates
		List<String> colors = Arrays.asList("Yellow", "Black", "Green", "Orange", "Purpple", "Red", "Red", "Yellow");
		List<String> sorting = colors.stream().distinct().collect(Collectors.toList());
	
		System.out.println(sorting);

	}

}
