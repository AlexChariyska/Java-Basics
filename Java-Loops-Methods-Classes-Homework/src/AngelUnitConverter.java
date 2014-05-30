import java.util.ArrayList;
import java.util.Scanner;

public class AngelUnitConverter {

	public static void main(String[] args) {
		// Problem 5: Write a method to convert from degrees to radians. Write a
		// method to convert from radians to degrees. You are given a number n
		// and n queries for conversion. Each conversion query will consist of a
		// number + space + measure. Measures are "deg" and "rad". Convert all
		// radians to degrees and all degrees to radians.

		ArrayList<Double> resultRadians = new ArrayList<>();
		ArrayList<Double> resultDegree = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {

			double value = in.nextDouble();
			String measure = in.next();
			if (measure.equals("rad")) {
				resultDegree.add(Degree(value));

			} else {
				resultRadians.add(Radian(value));

			}
		}
		System.out.println();
		for (Double radians : resultRadians) {
			System.out.printf("%.6f rad", radians);
		}
		System.out.println();
		for (Double degree : resultDegree) {
			System.out.printf("%.6f deg", degree);
		}
		in.close();
	}

	private static double Radian(double value) {
		double degrees = value * 180 / Math.PI;
		return degrees;
	}

	private static double Degree(double value) {
		double radian = value * Math.PI / 180;
		return radian;
	}

}