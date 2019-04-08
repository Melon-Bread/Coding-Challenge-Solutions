import java.util.Random;
import java.util.Scanner;

public class DiceRoll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String diceRoll = "";
        int diceCount = 0, diceSides = 0, diceTotal =0;

        while (diceRoll != "exit") {
            String beforeD = "", afterD = "";
            int locationD = 0;

            System.out.println("Enter your dice roll:");
            diceRoll = scanner.next();

            for (int i = 0; i < diceRoll.length(); i++) {
                char c = diceRoll.charAt(i);
                if (c == 'd' || c == 'D')
                    locationD = i;
            }

            for (int i = 0; i < diceRoll.length(); i++) {
                char c = diceRoll.charAt(i);

                if (c != 'd' && c != 'D') {
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
