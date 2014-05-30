import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DaysBetweenTwoDates {

	public static void main(String[] args) {
		// Write a program to calculate the difference between two dates in
		// number of days. The dates are entered at two consecutive lines in
		// format day-month-year. Days are in range [1…31]. Months are in range
		// [1…12]. Years are in range [1900…2100].
		
Scanner in=new Scanner(System.in);
		System.out.println("Insert  dates:");
		String secondInput=in.next();
		String firstInput=in.next();
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		Date dateSecond = null;
		try {
			date=df.parse(firstInput);
			dateSecond=df.parse(secondInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long diff = date.getTime() - dateSecond.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000);
		System.out.print(diffDays + " days");
		in.close();
	}

}
