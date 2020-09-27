import java.util.Scanner;

public class WarriorQuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cypher = scan.nextLine();

        String input = scan.nextLine();

        while (!input.equals("For Azeroth")) {
            String[] temp = input.split(" ");
            String command = temp[0];

            switch (command) {
                case "GladiatorStance":
                    cypher = cypher.toUpperCase();
                    System.out.println(cypher);
                    break;
                case "DefensiveStance":
                    cypher = cypher.toLowerCase();
                    System.out.println(cypher);
                    break;
                case "Dispel":
                    int index = Integer.parseInt(temp[1]);
                    String letter = temp[2];
                    if (index >= 0 && index < cypher.length()) {
                        char current = letter.charAt(0);
                        StringBuilder temporary = new StringBuilder(cypher);
                        temporary.setCharAt(index, current);
                        cypher = String.valueOf(temporary);
                        System.out.println("Success!");
                    } else {
                        System.out.println("Dispel too weak.");
                    }

                    break;
                case "Target":
                    String instruction = temp[1];
                    if (instruction.equals("Change")) {
                        String firstSubstring = temp[2];
                        String secondSubstring = temp[3];
                        cypher = cypher.replace(firstSubstring, secondSubstring);
                        System.out.println(cypher);
                    } else if (instruction.equals("Remove")) {
                        String substring = temp[2];
                        cypher = cypher.replace(substring, "");
                        System.out.println(cypher);
                    }
                    break;
                default:
                    System.out.println("Command doesn't exist!");
            }


            input = scan.nextLine();
        }
    }
}
