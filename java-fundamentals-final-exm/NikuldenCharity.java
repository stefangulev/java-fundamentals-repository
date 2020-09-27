import java.util.Scanner;

public class NikuldenCharity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String encrypted = scan.nextLine();

        String input = scan.nextLine();

        while (!input.equals("Finish")) {
            String[] temp = input.split(" ");
            String command = temp[0];

            switch (command) {
                case "Replace":
                    String currentChar = temp[1];
                    String newChar = temp[2];
                    encrypted = encrypted.replace(currentChar, newChar);
                    System.out.println(encrypted);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(temp[1]);
                    int endIndex = Integer.parseInt(temp[2]);

                    if (startIndex >= 0 && endIndex >= 0 && startIndex < encrypted.length() && endIndex < encrypted.length() && startIndex <= endIndex) {
                        StringBuilder temporary = new StringBuilder(encrypted);
                        temporary.replace(startIndex, endIndex + 1, "");
                        encrypted = String.valueOf(temporary);
                        System.out.println(encrypted);
                    }else {
                        System.out.println("Invalid indexes!");
                    }
                    break;
                case "Make":
                    String instruction = temp[1];
                    if (instruction.equals("Upper")) {
                        encrypted = encrypted.toUpperCase();
                        System.out.println(encrypted);
                    } else if (instruction.equals("Lower")) {
                        encrypted = encrypted.toLowerCase();
                        System.out.println(encrypted);
                    }
                    break;
                case "Check":
                    String toBeChecked = temp[1];
                    if (encrypted.contains(toBeChecked)) {
                        System.out.println(String.format("Message contains %s", toBeChecked));
                    } else {
                        System.out.println(String.format("Message doesn't contain %s", toBeChecked));
                    }
                    break;
                case "Sum":
                    int startSumIndex = Integer.parseInt(temp[1]);
                    int endSumIndex = Integer.parseInt(temp[2]);
                    if (startSumIndex >= 0 && endSumIndex >= 0 && startSumIndex < encrypted.length() && endSumIndex < encrypted.length() && startSumIndex <= endSumIndex) {
                        String toBeSummed = encrypted.substring(startSumIndex, endSumIndex + 1);
                        int result = sumSubstring(toBeSummed);
                        System.out.println(result);
                    } else {
                        System.out.println("Invalid indexes!");
                    }

                    break;
            }


            input = scan.nextLine();
        }
    }
    private static int sumSubstring(String toBeSummed) {
        int result = 0;
        for (int i = 0; i < toBeSummed.length(); i++) {
            int temp = toBeSummed.charAt(i);
            result += temp;
        }
        return result;
    }
}
