package interview;

import java.util.ArrayList;
import java.util.Collections;

//sort an array ( example alphabetically)
// We can use array list to hold all the names, and using  Collections class and sort method to sort the list
public class SortArrays {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();
		name.add("India");
		name.add("US");
		name.add("China");
		name.add("Denmark");
		name.add("Bangladesh");

		System.out.println(name);
		Collections.sort(name); // using sort method
		System.out.println(name);

	}

}
