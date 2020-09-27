import javax.sound.midi.Patch;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "U\\$(?<username>[A-Z]{1}[a-z]{2}[a-z]*)U\\$P\\@\\$(?<password>[A-Za-z]{5}[a-z]*[0-9]+)P\\@\\$";

        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scan.nextLine());

        int successfulCount = 0;

        for (int i = 0; i < n ; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                successfulCount++;
                System.out.println("Registration was successful");
                System.out.println(String.format("Username: %s, Password: %s", matcher.group("username"), matcher.group("password")));
            } else {
                System.out.println("Invalid username or password");
            }
        }

        System.out.println(String.format("Successful registrations: %d", successfulCount));

    }
}
