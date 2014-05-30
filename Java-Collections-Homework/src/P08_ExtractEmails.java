import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P08_ExtractEmails {

	public static void main(String[] args) {
		// Write a program to extract all email addresses from given text. The
		// text comes at the first input line. Print the emails in the output,
		// each at a separate line. Emails are considered to be in format
		// <user>@<host>.

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		String regex = "[\\w._-]*@(?:[\\w-]+\\.)[a-zA-Z]{2,7}";
		Pattern emailPattern = Pattern.compile(regex);
		Matcher matcher = emailPattern.matcher(input);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}

}
