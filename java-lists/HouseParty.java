import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> guests = new ArrayList<>();

        int commandsCount = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < commandsCount; i++) {

            String[] input = scan.nextLine().split("\\s+");
            String keyWord = input[2];
            String person = input[0];

            switch (keyWord) {
                case "going!":
                    if (!guests.contains(person)) {
                        guests.add(person);
                    } else {
                        System.out.printf("%s is already in the list!%n", person);
                    }
                    break;
                case "not":
                    if (guests.contains(person)) {
                        guests.remove(person);
                    } else {
                        System.out.printf("%s is not in the list!%n", person);
                    }
                    break;
            }

        }
        for (String guest : guests) {
            System.out.println(guest);

        }
    }
}
