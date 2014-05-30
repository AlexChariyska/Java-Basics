import java.util.Scanner;

public class GenerateThreeLetterWord {

	public static void main(String[] args) {
		// Write a program to generate and print all 3-letter words consisting
		// of given set of characters. For example if we have the characters 'a'
		// and 'b', all possible words will be "aaa", "aab", "aba", "abb",
		// "baa", "bab", "bba" and "bbb". The input characters are given as
		// string at the first line of the input. Input characters are unique
		// (there are no repeating characters)

		Scanner in = new Scanner(System.in);
		char[] input = in.next().toCharArray();
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				for (int m = 0; m < input.length; m++) {
					System.out.printf("%c%c%c ", input[i], input[j], input[m]);
				}
			}
		}
		in.close();
	}

}
