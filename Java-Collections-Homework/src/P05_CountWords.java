import java.util.Scanner;

public class P05_CountWords {
	// Write a program to count the number of words in given sentence. Use any
	// non-letter character as word separator.

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] words = input.split("\\W+");
		System.out.println(words.length);
		in.close();
	}

}
