import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\b[A-Z][a-z]+\\s[A-Z][a-z]+\\b";

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);

        while (match.find()) {
            System.out.print(match.group() + " ");
        }

    }
}
