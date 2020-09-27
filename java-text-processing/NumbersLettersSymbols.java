import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersLettersSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (Character.isLetter(symbol)) {
                letters.append(symbol);
            } else if (Character.isDigit(symbol)) {
                numbers.append(symbol);
            } else if (!Character.isLetterOrDigit(symbol)) {
                symbols.append(symbol);
            }
        }
        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
