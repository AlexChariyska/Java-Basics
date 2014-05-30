import java.util.Scanner;

public class P1_SymmmetricNumbers {

	public static void main(String[] args) {

		// P1: Write a program to generate and print all symmetric numbers in given
		// range [start…end] (0 ≤ start ≤ end ≤ 999). A number is symmetric if
		// its digits are symmetric toward its middle.
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		for (int i = start; i <= end; i++) {
			if (i < 10) {
				System.out.println(i + " ");
			} else if ((10 < i) && (i <= 99)) {
				int tens = (i / 10);
				int ones = (i % 10);
				if (tens == ones) {
					System.out.println(i + " ");
				}
			} else if (100<i){
				int hundred = i / 100;
				int ones = (i % 10);
				if (hundred == ones) {
					System.out.println(i + " ");
				}
			}
			in.close();
		}
	}
}
