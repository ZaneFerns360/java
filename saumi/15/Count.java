import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int alphabetCount = 0;
        int numberCount = 0;
        int spaceCount = 0;
        int specialSymbolCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetCount++;
            } else if (Character.isDigit(c)) {
                numberCount++;
            } else if (Character.isWhitespace(c)) {
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
