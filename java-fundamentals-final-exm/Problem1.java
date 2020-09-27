import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cypher = scan.nextLine();

        String input = scan.nextLine();

        while (!input.equals("Travel")) {
            String[] temp = input.split(":");
            String command = temp[0];

            switch (command) {
                case "Add Stop":
                    int indexToAdd = Integer.parseInt(temp[1]);
                    String stringToAdd = temp[2];

                    if (indexToAdd >= 0 && indexToAdd <cypher.length()) {
                        StringBuilder temporary = new StringBuilder(cypher);
                        temporary.insert(indexToAdd, stringToAdd);
                        cypher = String.valueOf(temporary);

                    }
                    System.out.println(cypher);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(temp[1]);
                    int endIndex = Integer.parseInt(temp[2]);
                    StringBuilder tempRemove = new StringBuilder(cypher);
                    if (startIndex >= 0 && endIndex >= 0 && startIndex < cypher.length() && endIndex < cypher.length() && startIndex <= endIndex) {
                        tempRemove.replace(startIndex, endIndex + 1, "");
                        cypher = String.valueOf(tempRemove);

                    }
                    System.out.println(cypher);
                    break;
                case "Switch":
                    String oldString = temp[1];
                    String newString = temp[2];

                    if (cypher.contains(oldString)) {
                        cypher = cypher.replace(oldString, newString);
                    }
                    System.out.println(cypher);

                    break;
            }

            input = scan.nextLine();
            List<String> list = new ArrayList<>();
            list.clear();
        }

        System.out.println(String.format("Ready for world tour! Planned stops: %s", cypher));

    }

}
