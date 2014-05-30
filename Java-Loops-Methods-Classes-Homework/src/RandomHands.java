import java.util.Random;
import java.util.Scanner;

public class RandomHands {

	public static void main(String[] args) {

		// Write a program to generate n random hands of 5 different cards form
		// a standard suit of 52 cards.

		Scanner in = new Scanner(System.in);
		System.out.println("Insert number n:");
		int n = in.nextInt();
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };

		String[] suits = { "\u2660", "\u2666", "\u2665", "\u2663" };

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				Random random = new Random();
				int color = random.nextInt(suits.length);
				int rand = random.nextInt(cards.length);
				System.out.print(cards[rand] + suits[color] + " ");
			}
			System.out.println();
		}
		in.close();
	}

}
