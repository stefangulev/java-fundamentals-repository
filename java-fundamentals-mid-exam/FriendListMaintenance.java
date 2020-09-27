import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> friendList = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());

        String input = scan.nextLine();
        int blakcListNames = 0;
        int lostNames = 0;

        while (!input.equals("Report")) {
            String[] command = input.split(" ");
            String instruction = command[0];

            switch (instruction) {
                case "Blacklist":
                    String name = command[1];
                    if (friendList.contains(name)) {
                        friendList.set(friendList.indexOf(name), "Blacklisted");
                        System.out.printf("%s was blacklisted.%n", name);
                        blakcListNames++;
                    } else {
                        System.out.printf("%s was not found.%n", name );
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(command[1]);
                    if (!friendList.get(index).equals("Blacklisted") && !friendList.get(index).equals("Lost")) {
                        System.out.printf("%s was lost due to an error.%n", friendList.get(index));
                        friendList.set(index, "Lost");
                        lostNames++;

                    }

                    break;
                case "Change":
                        int changeIndex = Integer.parseInt(command[1]);
                        String newName = command[2];
                        if (changeIndex >= 0 && changeIndex < friendList.size()) {
                            System.out.printf("%s changed his username to %s.%n", friendList.get(changeIndex), newName);
                            friendList.set(changeIndex, newName);
                        }
                    break;
            }

            input = scan.nextLine();
        }

        System.out.printf("Blacklisted names: %d%n", blakcListNames);
        System.out.printf("Lost names: %d%n", lostNames);
        for (String s : friendList) {
            System.out.print(s + " ");
        }
    }
}
