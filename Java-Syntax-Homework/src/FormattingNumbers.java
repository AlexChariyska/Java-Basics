import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		// Problem 6: Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500), a
		// floating-point b and a floating-point c and prints them in 4 virtual
		// columns on the console. Each column should have a width of 10
		// characters. The number a should be printed in hexadecimal, left
		// aligned; then the number a should be printed in binary form, padded
		// with zeroes, then the number b should be printed with 2 digits after
		// the decimal point, right aligned; the number c should be printed with
		// 3 digits after the decimal point, left aligned

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String binary = String.format("%16s", Integer.toBinaryString(a))
				.replace(' ', '0');
		float b = in.nextFloat();
		float c = in.nextFloat();

		System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|",
				Integer.toHexString(a), binary, b, c);
		in.close();
	}
}
