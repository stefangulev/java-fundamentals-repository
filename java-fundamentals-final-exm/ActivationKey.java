import java.util.Scanner;

public class ActivationKey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rawCode = scan.nextLine();

        String input = scan.nextLine();

        while (!input.equals("Generate")) {

            String[] commands = input.split(">>>");
            String instruction = commands[0];

            switch (instruction) {
                case "Contains":
                    String substring = commands[1];
                    if (rawCode.contains(substring)) {
                        System.out.printf("%s contains %s%n",rawCode, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String caseType = commands[1];
                    int startIndex = Integer.parseInt(commands[2]);
                    int endIndex = Integer.parseInt(commands[3]);
                    String temp = rawCode.substring(startIndex, endIndex);

                    if (caseType.equals("Lower")) {
                        String lower = temp.toLowerCase();
                        rawCode = rawCode.replace(temp, lower);
                        System.out.println(rawCode);
                    } else if (caseType.equals("Upper")) {
                        String upper = temp.toUpperCase();
                        rawCode = rawCode.replace(temp, upper);
                        System.out.println(rawCode);
                    }

                    break;
                case "Slice":
                    int firstIndex = Integer.parseInt(commands[1]);
                    int lastIndex = Integer.parseInt(commands[2]);
                    String replaced = rawCode.substring(firstIndex, lastIndex);
                    rawCode = rawCode.replace(replaced, "");
                    System.out.println(rawCode);
                    break;

            }


            input = scan.nextLine();
        }

        System.out.printf("Your activation key is: %s", rawCode);
    }
}
