import java.util.Scanner;

public class DecimalToHexadecimal {

	// Problem5: Write a program that enters a positive integer number num and
	// converts and prints it in hexadecimal form. You may use some built-in
	// method from the standard Java libraries.

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insert number:");
		int number = in.nextInt();
		System.out.println(Integer.toHexString(number));
		in.close();
	}

}
