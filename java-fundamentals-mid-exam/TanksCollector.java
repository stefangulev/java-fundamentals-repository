import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TanksCollector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> ownedTanks = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());

        int lines = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] commands = scan.nextLine().split(", ");
            String instruction = commands[0];

            switch (instruction) {
                case "Add":
                    String tankName = commands[1];
                    if(ownedTanks.contains(tankName)) {
                        System.out.println("Tank is already bought");
                    }else {
                        System.out.println("Tank successfully bought");
                        ownedTanks.add(tankName);
                    }
                    break;
                case "Remove":
                    String removeTankName = commands[1];
                    if (!ownedTanks.contains(removeTankName)) {
                        System.out.println("Tank not found");
                } else {
                        System.out.println("Tank successfully sold");
                        ownedTanks.remove(removeTankName);
                    }
                    break;
                case "Remove At":
                    int index = Integer.parseInt(commands[1]);
                    if (index >= 0 && index < ownedTanks.size()) {
                        System.out.println("Tank successfully sold");
                        ownedTanks.remove(index);
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(commands[1]);
                    String tankToInsert = commands[2];
                    if (indexToInsert >= 0 && indexToInsert < ownedTanks.size()) {
                        if (ownedTanks.contains(tankToInsert)) {
                            System.out.println("Tank is already bought");
                        } else {
                            System.out.println("Tank successfully bought");
                            ownedTanks.add(indexToInsert, tankToInsert);
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;

            }

        }
        for (int i = 0; i < ownedTanks.size() ; i++) {
            if (i +1 == ownedTanks.size()) {
                System.out.print(ownedTanks.get(i));
            } else {
                System.out.print(ownedTanks.get(i) + ", " );
            }
        }
    }
}
