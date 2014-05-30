import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		// At the first line at the console you are given a piece of text.
		// Extract all words from it and print them in alphabetical order.
		// Consider each non-letter character as word separator. Take the
		// repeating words only once. Ignore the character casing. Print the
		// result words in a single line, separated by spaces

		Scanner in = new Scanner(System.in);
		String input = in.nextLine().toLowerCase();
		String[] words = input.split("\\W+");
		Set<String> set = new TreeSet<String>();

		for (String str : words) {
			set.add(str);
		}
		
		// System.out.println(set); Output-> [arg, arg, arg ]
		
		for (String string : set) {
			System.out.print(string + " ");
		}
	}

}
