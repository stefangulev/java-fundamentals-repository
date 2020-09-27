import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> validUsername = new ArrayList<>();
        String[] input = scan.nextLine().split(", ");

        for (int i = 0; i < input.length ; i++) {
            boolean isValid = usernameChecker(input[i]);
            if (isValid) {
                validUsername.add(input[i]);
            }
        }

        for (String s : validUsername) {
            System.out.println(s);
        }
    }

    private static boolean usernameChecker(String username) {
        boolean isValid = false;
        if (username.length() >= 3 && username.length() <= 16) {
            for (int i = 0; i < username.length(); i++) {
                char current = username.charAt(i);
                if (Character.isLetterOrDigit(current) || current == '-' || current == '_') {
                    isValid = true;
                } else {
                    isValid = false;
                    break;
                }
            }
        }
        return isValid;
    }
}
