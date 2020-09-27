import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> items = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("Craft!")) {
            String[] temp = input.split(" - ");

            String command = temp[0];
            String item = temp[1];

            switch (command) {
                case "Collect":
                    if (!items.contains(item)) {
                        items.add(item);
                    }
                    break;
                case "Drop":
                    if (items.contains(item)) {
                        items.remove(item);
                    }
                    break;
                case "Combine Items":
                    String[] oldNewItems = item.split(":");
                    String oldItem = oldNewItems[0];
                    String newItem = oldNewItems[1];

                    if (items.contains(oldItem)) {
                        items.add(items.indexOf(oldItem) + 1, newItem);
                    }
                    break;
                case "Renew":
                    if (items.contains(item)) {
                        items.remove(item);
                        items.add(item);
                    }
                    break;
            }

            input = scan.nextLine();
        }

        for (int i = 0; i < items.size(); i++) {
            if (i + 1 == items.size()) {
                System.out.print(items.get(i));
            } else {
                System.out.print(items.get(i) +", ");
            }
        }
    }
}
