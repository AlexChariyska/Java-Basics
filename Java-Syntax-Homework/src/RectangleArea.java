import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// Problem 1: Write a program that enters the sides of a rectangle (two
		// integers a and b) and calculates and prints the rectangle's area.
		
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double area = a * b;
		System.out.println("The rectangle area is:" + area);
		in.close();
	}

}
