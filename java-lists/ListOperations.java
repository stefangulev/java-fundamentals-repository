import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        String[] numbers1 = scan.nextLine().split(" ");

        for (int i = 0; i < numbers1.length; i++) {
            int currentNumber = Integer.parseInt(numbers1[i]);
            numbers.add(currentNumber);
        }

        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] commands = input.split(" ");
            String command = commands[0];
            int element = 0;
            int index = 0;
            switch (command) {
                case "Add":
                    element = Integer.parseInt(commands[1]);
                    numbers.add(element);
                    break;
                case "Remove":
                    index = Integer.parseInt(commands[1]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(commands[2]);
                    String direction = commands[1];
                    if (direction.equals("left")) {
                        for (int i = 0; i < count; i++) {
                            numbers.add(numbers.size(), numbers.get(0));
                            numbers.remove(numbers.get(0));
                        }

                    } else if (direction.equals("right")) {
                        for (int i = 0; i < count; i++) {
                            numbers.add(0, numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                        }
                    }
                    break;
                case "Insert":
                    element = Integer.parseInt(commands[1]);
                    index = Integer.parseInt(commands[2]);
                    if (index >= 0 && index <= numbers.size()) {
                        numbers.add(index, element);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;


            }
            input = scan.nextLine();

        }
        for (Integer number : numbers) {
            System.out.print(number + " ");

        }
    }
}
