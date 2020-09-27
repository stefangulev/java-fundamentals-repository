import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecripter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\B([$, %])(?<request>[A-Z][a-z][a-z]+)\\1: (?<nums>[\\[0-9\\]]+\\|){3}\\B";

        int n = Integer.parseInt(scan.nextLine());

        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i <n ; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String word = matcher.group("request");
                String encrypted = "";
               

            } else {
                System.out.println("Valid message not found!");
            }

        }
    }
}
