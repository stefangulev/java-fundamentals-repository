import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\|(?<name>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)#";

        int n = Integer.parseInt(scan.nextLine());

        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i <n ; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String title = matcher.group("title");
                int strength = name.length();
                int armour = title.length();

                System.out.println(String.format("%s, The %s", name, title));
                System.out.println(String.format(">> Strength: %d", strength));
                System.out.println(String.format(">> Armour: %d", armour));
            } else {
                System.out.println("Access denied!");
            }

        }
    }
}
