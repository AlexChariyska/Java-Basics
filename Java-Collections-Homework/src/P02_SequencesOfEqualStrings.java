import java.util.Scanner;

public class P02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		// Write a program that enters an array of strings and finds in it all
		// sequences of equal elements. The input strings are given as a single
		// line, separated by a space.

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] array = input.split(" ");
		System.out.print(array[0]);
		for (int i = 1; i < array.length; i++) {

			if (array[i].equals(array[i - 1])) {
				System.out.print(" " + array[i]);
			} else {
				System.out.println();
				System.out.print(array[i]);

			}
		}

	}
}
