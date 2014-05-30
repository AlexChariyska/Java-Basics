import java.util.*;
import java.util.Scanner;
import java.util.Set;

public class P09_CombineListsOfLetters {

	public static void main(String[] args) {
		// Write a program that reads two lists of letters l1 and l2 and
		// combines them: appends all letters c from l2 to the end of l1, but
		// only when c does not appear in l1. Print the obtained combined list.
		// All lists are given as sequence of letters separated by a single
		// space, each at a separate line. Use ArrayList<Character> of chars to
		// keep the input and output lists.

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String input2 = in.nextLine();

		char[] charArr = input.toCharArray();
		char[] charArr2 = input2.toCharArray();

		List<Character> charList1 = new ArrayList<Character>();
		List<Character> charList2 = new ArrayList<Character>();

		for (char element : charArr) {
			charList1.add(element);
		}
		for (char element : charArr2) {
			charList2.add(element);
		}

		for (int i = 0; i < charList2.size(); i++) {
			if (charList1.contains(charList2.get(i))) {
				continue;
			} else {
				charList1.add(charList2.get(i));
			}
		}

		for (Character character : charList1) {
			System.out.print(character);
		}
	}
}
