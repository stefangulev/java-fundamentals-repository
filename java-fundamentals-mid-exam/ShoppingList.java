import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> product = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("Go Shopping!")) {
            String[] temp = input.split(" ");
            String command = temp[0];
            String item = temp[1];

            switch (command) {
                case "Urgent":
                    if (!product.contains(item)) {
                        product.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (product.contains(item)) {
                        product.remove(item);
                    }
                    break;
                case "Correct":
                    String oldName = temp[1];
                    String newName = temp[2];
                    if (product.contains(oldName)) {
                        product.set(product.indexOf(oldName), newName);
                    }
                    break;
                case "Rearrange":
                    if (product.contains(item)) {
                        product.remove(item);
                        product.add(item);
                    }
                    break;
            }

            input = scan.nextLine();
        }

        for (int i = 0; i < product.size() ; i++) {
            if (i + 1 == product.size()) {
                System.out.print(product.get(i));
            } else {
                System.out.print(product.get(i) + ", ");
            }
        }
    }
}
