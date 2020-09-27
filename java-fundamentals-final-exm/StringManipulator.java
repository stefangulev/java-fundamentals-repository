import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] temp = input.split(" ");
            String command = temp[0];

            switch (command) {
                case "Translate":
                    String toBeReplaced = temp[1];
                    String replacement = temp[2];
                    text = text.replace(toBeReplaced, replacement);
                    System.out.println(text);
                    break;
                case "Includes":
                    String tempText = temp[1];
                    if (text.contains(tempText)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String toStart = temp[1];
                    if (text.indexOf(toStart) == 0) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    text = text.toLowerCase();
                    System.out.println(text);
                    break;
                case "FindIndex":
                    String tempChar = temp[1];
                    int lastIndex = text.lastIndexOf(tempChar);
                    System.out.println(lastIndex);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(temp[1]);
                    int count = Integer.parseInt(temp[2]);
                    String toBeRemoved = text.substring(startIndex, startIndex + count);
                    text = text.replace(toBeRemoved, "");
                    System.out.println(text);
                    break;

            }

            input = scan.nextLine();
        }

    }
}
