public class AlphabetCounter {
    public static void main(String[] args) {
        String input = "Hello,123 World!";

        int alphabetCount = 0;
        int numberCount = 0;
        int spaceCount = 0;
        int specialSymbolCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                alphabetCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                specialSymbolCount++;
            }
        }

        System.out.println("Alphabets: " + alphabetCount);
        System.out.println("Numbers: " + numberCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Special Symbols: " + specialSymbolCount);
    }
}
