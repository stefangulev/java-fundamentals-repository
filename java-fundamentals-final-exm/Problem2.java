import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "([\\=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";

        List<String> validDestinations = new ArrayList<>();
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String valid = matcher.group("destination");
            validDestinations.add(valid);
        }

        int travelPoints = 0;
        for (String validDestination : validDestinations) {
            int currentLength = validDestination.length();
            travelPoints += currentLength;
        }

        System.out.println(String.format("Destinations: %s", validDestinations.toString().replaceAll("[\\[\\]]", "") ));
        System.out.println(String.format("Travel Points: %d", travelPoints));


    }
}
