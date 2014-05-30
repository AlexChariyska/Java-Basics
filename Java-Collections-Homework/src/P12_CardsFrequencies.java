import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P12_CardsFrequencies {

	public static void main(String[] args) {
		// We are given a sequence of N playing cards from a standard deck. The
		// input consists of several cards (face + suit), separated by a space.
		// Write a program to calculate and print at the console the frequency
		// of each card face in format "card_face -> frequency". The frequency
		// is calculated by the formula appearances / N and is expressed in
		// percentages with exactly 2 digits after the decimal point. The card
		// faces with their frequency should be printed in the order of the card
		// face's first appearance in the input. The same card can appear
		// multiple times in the input, but it's face should be listed only once
		// in the output

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] array = input.split("[ ♥♣♦♠]+");

		double n = array.length;
		Map<String, Integer> cards = new LinkedHashMap<String, Integer>();
		for (String card : array) {
			Integer count = cards.get(card);
			if (count == null) {
				count = 0;
			}
			cards.put(card, count + 1);
		}
		for (Map.Entry<String, Integer> entry : cards.entrySet()) {
			double precentage = (double) entry.getValue() * 100 / n;
			System.out.printf("%s -> %.2f%%\n", entry.getKey(), precentage);
		}
	}

}
