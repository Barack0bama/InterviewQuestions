package interview;

public class Reverse {

	public static void main(String[] args) {
		
		// Reverse Using build in method 
		StringBuffer a = new StringBuffer("Hello!!! this is reverse strign using reverse method");
		a.reverse();
		System.out.println(a);
		
		// Reverse using for loop
		String b = "Hello!!!";
		String c = "";
		for (int i = b.length() - 1; i >= 0; i--) {
			c = c + b.charAt(i);
		}
		
		System.out.println(c);
	}

}
