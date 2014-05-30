import java.util.Scanner;

public class P03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		// Write a program that enters an array of strings and finds in it the
		// largest sequence of equal elements. If several sequences have the
		// same longest length, print the leftmost of them. The input strings
		// are given as a single line, separated by a space.

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] array = input.split(" ");
		int count=1;
		int countFinal=0;
		String element=null;
		
		for (int i = 1; i < array.length; i++) {
				if (array[i].equals(array[i - 1])) {
					count++;
				} else {
					count = 1;
				}
				if (count > countFinal) {
					countFinal = count;
					element = array[i];
				}
			}
			for (int j = 0; j < countFinal; j++) {
				System.out.print(element +" ");		
			}
		}
	}

