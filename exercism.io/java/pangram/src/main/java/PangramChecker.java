public class PangramChecker {
    public boolean isPangram(String input) {
        StringBuilder alphabet = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

        for (int x = 0; x < input.length(); x++) {
            for (int y = 0; y < alphabet.length(); y++) {
                if (input.toLowerCase().charAt(x) == alphabet.charAt(y))
                    alphabet.deleteCharAt(y);
            }
        }
        return alphabet.length() == 0;
    }
}
