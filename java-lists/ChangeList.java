import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();
        while (!input.equals("end")) {

            String[] parts = input.split("\\s+");
            int element = Integer.parseInt(parts[1]);
            String command = parts[0];

            if (command.equals("Delete")) {
                while (numbers.contains(element)) {
                    numbers.remove(Integer.valueOf(element));
                }
            } else if (command.equals("Insert")) {
                int position = Integer.parseInt(parts[2]);
                if (position >= 0 && position < numbers.size()) {
                    numbers.add(position, element);
                }


            }
            input = scan.nextLine();

            }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}