import java.util.Scanner;

public class CountOfEqualsBitPaires {

	public static void main(String[] args) {
		// *Problem 8: Write a program to count how many sequences of two equal bits ("00"
		// or "11") can be found in the binary representation of given integer
		// number n (with overlapping).

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String binaryN=Integer.toBinaryString(n);
		int count = 0;
		for (int i = 1; i < binaryN.length(); i++) {
			int mask = 1 << i;
			int result = (mask & n) >> i;
			int maskSecond = 1 << (i - 1);
			int resultSecond = (maskSecond & n) >> (i - 1);
			if ((result == 1 && resultSecond == 1) || (result == 0
					&& resultSecond == 0)) {
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}
}
