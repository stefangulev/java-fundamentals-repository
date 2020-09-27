import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class WizardPoker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> deck = Arrays.stream(scan.nextLine().split(":")).collect(Collectors.toList());
        List<String> newDeck = new ArrayList<>();

        String input = scan.nextLine();

        while (!input.equals("Ready")) {
            String[] commands = input.split(" ");
            String instruction = commands[0];
            String cardName = commands[1];

            switch (instruction) {
                case "Add":
                    if (!deck.contains(cardName)) {
                        System.out.println("Card not found.");
                    } else {
                        newDeck.add(cardName);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commands[2]);
                    if (deck.contains(cardName) && index >= 0 && index <= newDeck.size()) {
                        newDeck.add(index, cardName);
                    } else {
                        System.out.println("Error!");
                    }
                    break;
                case "Remove":
                    if (!newDeck.contains(cardName)) {
                        System.out.println("Card not found.");
                    } else {
                        newDeck.remove(cardName);
                    }
                    break;
                case "Swap":
                    String cardNameTwo = commands[2];
                    int indexOfFirst = newDeck.indexOf(cardName);
                    newDeck.set(newDeck.indexOf(cardNameTwo), cardName);
                    newDeck.set(indexOfFirst, cardNameTwo);
                    break;
                case "Shuffle":
                    Collections.reverse(newDeck);
                    break;

            }

            input = scan.nextLine();
        }

        for (String s : newDeck) {
            System.out.print(s + " ");
        }
    }
}
