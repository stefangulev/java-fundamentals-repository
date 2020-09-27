import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessegeTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\!(?<command>[A-Z][a-z]{2,})!:\\[(?<message>[A-Za-z]{8,})\\]";

        int n = Integer.parseInt(scan.nextLine());

        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i <n ; i++) {
            String temp = scan.nextLine();
            Matcher matcher = pattern.matcher(temp);
            if (matcher.find()) {
                String command = matcher.group("command");
                String message = matcher.group("message");
                List<Integer> numbers = new ArrayList<>();
                for (int j = 0; j <message.length(); j++) {
                    int nums = message.charAt(j);
                    numbers.add(nums);
                }
                System.out.println(String.format("%s: %s", command, numbers.toString().replaceAll("[\\[\\],]", "")));
            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}
