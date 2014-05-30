import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04_LongestIncreasingSequence {

	public static void main(String[] args) {

		// P04: Write a program to find all increasing sequences inside an array
		// of
		// integers. The integers are given in a single line, separated by a
		// space. Print the sequences in the order of their appearance in the
		// input array, each at a single line. Separate the sequence elements by
		// the last line. If several sequences have the same longest length,
		// print the leftmost of them.

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] array = input.split(" ");

		int element = 0;
		int count = 1;
		int countFinal = 0;
		int[] numbers = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			numbers[i] = Integer.parseInt(array[i]);
		}

		System.out.print(array[0]);
		for (int i = 1; i < array.length; i++) {
			if (array[i].compareTo(array[i - 1]) >= 1) {
				count++;
				System.out.print(" " + array[i]);

			} else {
				count = 1;
				System.out.println();
				System.out.print(array[i]);
			}
			if (count > countFinal) {
				countFinal = count;
				element = i;

			}
		}
		System.out.println();
		System.out.print("Longest: ");
		for (int j = 0; j < countFinal - 1; j++) {
			System.out.print(array[element - countFinal + 1 + j] + " ");
		}
		System.out.println(array[element]);
		in.close();
	}

}