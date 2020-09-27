import java.util.Scanner;

public class CharacterInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char firstChar = scan.nextLine().charAt(0);
        char secondChar = scan.nextLine().charAt(0);

        printCharacterInRange(firstChar, secondChar);
    }

    private static void printCharacterInRange(char firstChar, char secondChar) {
        if (firstChar < secondChar) {
            for (int i = firstChar + 1; i < secondChar; i++) {
                char currentChar = (char) i;
                System.out.print(currentChar + " ");
            }
        } else {
            for (int i = secondChar + 1; i < firstChar; i++) {
                char currentChar = (char) i;
                System.out.print(currentChar + " ");
            }
        }
    }
}
