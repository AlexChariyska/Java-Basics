import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P11_MostFrequentWord {

	public static void main(String[] args) {
		// Write a program to find the most frequent word in a text and print
		// it, as well as how many times it appears in format "word -> count".
		// Consider any non-letter character as a word separator. Ignore the
		// character casing. If several words have the same maximal frequency,
		// print all of them in alphabetical order.
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine().toLowerCase();
		String[] words = input.split("\\W+");
		Map<String, Integer> wordsCount = new HashMap<String, Integer>();

		Arrays.sort(words);
		int count = 1;
		int finalCount = 0;
		for (int i = 1; i < words.length; i++) {
			if (words[i].equals(words[i - 1])) {
				count++;
			} else {
				count = 1;
			}
			if (count >= finalCount) {
				finalCount = count;
				wordsCount.put(words[i], finalCount);
			}
		}
		for (String key : wordsCount.keySet()) {
			System.out.println("" + key + " -> " + wordsCount.get(key));
		}
	}
}
