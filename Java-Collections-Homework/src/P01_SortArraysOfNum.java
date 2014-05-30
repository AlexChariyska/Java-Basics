import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class P01_SortArraysOfNum {

	public static void main(String[] args) {
		// Write a program to enter a number n and n integer numbers and sort
		// and print them. Keep the numbers in array of integers: int[].

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			String element = in.next();

			array[i] = Integer.parseInt(element);
		}
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
