import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LastStop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> paintings = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("END")) {
            String[] commands = input.split(" ");
            String trigger = commands[0];

            switch (trigger) {
                case "Change":
                    int changedPainting = Integer.parseInt(commands[2]);
                    int currentPainting = Integer.parseInt(commands[1]);
                    if (paintings.contains(currentPainting)) {
                        paintings.set(paintings.indexOf(currentPainting), changedPainting);
                    }
                    break;
                case "Hide":
                    int removedPainting = Integer.parseInt(commands[1]);
                    if (paintings.contains(removedPainting)) {
                        paintings.remove(Integer.valueOf(removedPainting));
                    }
                    break;
                case "Switch":
                    int firstPainting = Integer.parseInt(commands[1]);
                    int secondPainting = Integer.parseInt(commands[2]);
                    if (paintings.contains(firstPainting) && paintings.contains(secondPainting)) {
                        int firstIndex = paintings.indexOf(firstPainting);
                        int secondIndex = paintings.indexOf(secondPainting);
                        paintings.set(firstIndex, secondPainting);
                        paintings.set(secondIndex, firstPainting);
                    }
                    break;
                case "Insert":
                    int place = Integer.parseInt(commands[1]) + 1;
                    int newPainting = Integer.parseInt(commands[2]);

                    if (place < paintings.size()) {
                        paintings.add(place,newPainting);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(paintings);
                    break;
            }
            input = scan.nextLine();
        }
        for (Integer painting : paintings) {
            System.out.print(painting + " ");
        }
    }
}
