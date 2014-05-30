import java.util.Scanner;

public class P06_CountSpecifiedWord {

	public static void main(String[] args) {
		// P06. Write a program to find how many times a word appears in given
		// text.
		// The text is given at the first input line. The target word is given
		// at the second input line. The output is an integer number. Please
		// ignore the character casing. Consider that any non-letter character
		// is a word separator.
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine().toLowerCase();
		String wordTarget = in.next().toLowerCase();
		String[] words = input.split("\\W+");
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(wordTarget)) {
				count++;
			}

		}
		System.out.println(count);
	}

}
