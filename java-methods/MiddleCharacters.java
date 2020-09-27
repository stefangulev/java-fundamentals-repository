import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        printMiddleChar(input);
    }

    private static void printMiddleChar (String input) {
        if (input.length() % 2 != 0) {
            char middleChar = input.charAt((int) Math.ceil(((input.length() - 1) * 1.0) / 2));
            System.out.println(middleChar);

        } else {
            char firstChar = input.charAt((int) Math.floor(((input.length() - 1) * 1.0) / 2));
            char secondChar = input.charAt((int) Math.ceil(((input.length() - 1) * 1.0) / 2));
            System.out.printf("%c%c", firstChar,secondChar);
        }
    }
}
