import java.util.Scanner;

public class CountOfBitOne {

	public static void main(String[] args) {
		// Problem 7: Write a program to calculate the count of bits 1 in the
		// binary representation of given integer number n.
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		for (int i = 0; i < Integer.SIZE; i++) {
			int mask = 1 << i;
			int result = (mask & n) >> i;
			if (result == 1) {
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}

}
