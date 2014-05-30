import java.util.Scanner;


public class SmallestOfNumbers {

	public static void main(String[] args) {
		// Problem 4: Write a program that finds the smallest of three numbers.
		
		Scanner in =new Scanner(System.in);
		System.out.println("Insert three numbers: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double min = Math.min(a, Math.min(b, c));
		System.out.println("Result: " + min);
		in.close();

	}

}
