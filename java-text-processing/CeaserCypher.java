import java.util.Scanner;

public class CeaserCypher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input =scan.nextLine();
        StringBuilder replaced = new StringBuilder();

        for (int i = 0; i < input.length() ; i++) {
            char current = input.charAt(i);
            char newChar = (char) (current + 3);
            replaced.append(newChar);
        }

        System.out.println(replaced);
    }
}
