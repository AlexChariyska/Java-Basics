import java.util.Scanner;

public class P07_CountSubstringOccurrences {

	public static void main(String[] args) {
		// Write a program to find how many times given string appears in given
		// text as substring. The text is given at the first input line. The
		// search string is given at the second input line. The output is an
		// integer number. Please ignore the character casing.

		Scanner in = new Scanner(System.in);
		String input = in.nextLine().toLowerCase();
		String target = in.next().toLowerCase();

			int count = 0;
			int index = 0;

			while ((index = input.indexOf(target, index)) != -1) {
				index++;
				count++;
			}
			System.out.println(count);
		}
	}

