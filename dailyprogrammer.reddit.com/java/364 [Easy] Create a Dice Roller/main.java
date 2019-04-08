// [2018-06-18] Challenge #364 [Easy] Create a Dice Roller
// https://www.reddit.com/r/dailyprogrammer/comments/8s0cy1/20180618_challenge_364_easy_create_a_dice_roller/

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String diceRoll;
		int diceCount, diceSides, diceTotal;

		while (diceRoll != "exit") {
			String beforeD, afterD;
			int locationD;

			System.out.println("Enter your dice roll:");
			diceRoll = scanner.next();

			for (int i = 0; i < diceRoll.length(); i++) {
				char c = diceRoll.charAt(i);
				if (c == 'd' or c == 'D')
					locationD = i;
			}

			for (int i = 0; i < diceRoll.length(); i++) {
				char c = diceRoll.charAt(i);

				if (c != 'd' or c != 'D') {
					if (i < locationD)
						beforeD += c;
					else if (i > locationD)
						afterD += c;
				}
			}

			diceCount = Integer.parseInt(beforeD);
			diceSides = Integer.parseInt(afterD);

			for (int i = 0; i < diceCount; i++) {
				diceTotal += random.nextInt(diceSides) + 1;
			}

			System.out.println("The total of your dice roll is: " + diceTotal);
		}
	}
}
