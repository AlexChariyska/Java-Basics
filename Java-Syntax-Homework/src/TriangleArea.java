import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// Problem2: Write a program that enters 3 points in the plane (as integer x and y
		// coordinates), calculates and prints the area of the triangle composed
		// by these 3 points. Round the result to a whole number. In case the
		// three points do not form a triangle, print "0" as result.
		
		Scanner in = new Scanner(System.in);
		System.out.println("Insert first coordinates:");
		double x = in.nextDouble();
		double y = in.nextDouble();
		System.out.println("Insert second coordinates:");
		double xSecond = in.nextDouble();
		double ySecond = in.nextDouble();
		System.out.println("Insert first coordinates:");
		double xThird = in.nextDouble();
		double yThird = in.nextDouble();
		double area = (x * (ySecond - yThird) + xSecond * (yThird - y) + xThird* (y - ySecond)) / 2;
		if (area >= 0) {
			System.out.println("The area is:" + area);

		} else {
			System.out.println("The area is:" + area*(-1));
		}
		in.close();
	}

}
