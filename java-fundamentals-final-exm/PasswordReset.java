import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rawPassword = scan.nextLine();

        String input = scan.nextLine();

        while (!input.equals("Done")) {
            String[] temp = input.split(" ");
            String instruction = temp[0];

            switch (instruction) {
                case "TakeOdd":
                    rawPassword = takeOdd(rawPassword);
                    System.out.println(rawPassword);
                    break;
                case "Cut":
                    int givenIndex = Integer.parseInt(temp[1]);
                    int length = Integer.parseInt(temp[2]);
                    String toBeCut = rawPassword.substring(givenIndex, givenIndex +length);
                    rawPassword = rawPassword.replaceFirst(toBeCut, "");
                    System.out.println(rawPassword);
                    break;
                case "Substitute":
                    String tobeReplaced = temp[1];
                    String substitue = temp[2];

                    if (rawPassword.contains(tobeReplaced)) {
                        rawPassword = rawPassword.replace(tobeReplaced, substitue);
                        System.out.println(rawPassword);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            input = scan.nextLine();
        }
        System.out.println(String.format("Your password is: %s", rawPassword));

    }

    private static String takeOdd (String rawPassword) {
        String newPass = "";
        for (int i = 1; i <rawPassword.length() ; i+=2) {
            newPass += rawPassword.charAt(i);
        }
        return newPass;
    }
}
