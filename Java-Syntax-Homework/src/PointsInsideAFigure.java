import java.util.Scanner;

public class PointsInsideAFigure {

	public static void main(String[] args) {
		// Problem 3: Write a program to check whether a point is inside or outside of the
		// figure below. The point is given as a pair of floating-point numbers,
		// separated by a space. Your program should print "Inside" or
		// "Outside".
		
		Scanner in = new Scanner(System.in);
		System.out.println("Insert the coordinates on the same line divided by space: ");
		String input = in.nextLine();
		String coord[] = input.split(" ");
		double x = Double.parseDouble(coord[0]);
		double y = Double.parseDouble(coord[1]);
		if ((y >= 6 && y <= 13.5) && (x >= 12.5 && x <= 17.5)) {
			System.out.println("Inside");
		} else if ((x >= 17.5 && x <= 22.5) && (y >= 6 && y <= 8.5)) {
			System.out.println("Inside");
		} else if ((x >= 20 && x <= 22.5) && (y >= 6 && y <= 13.5)) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
		in.close();
	}

}
