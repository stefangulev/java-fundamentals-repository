import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder secretMessege = new StringBuilder(scan.nextLine());

        String input = scan.nextLine();

        while (!input.equals("Reveal")) {
            String[] temp = input.split(":\\|:");
            String command = temp[0];

            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(temp[1]);
                   secretMessege.insert(index, " ");
                    System.out.println(secretMessege);

                    break;
                case "Reverse":
                    String toBeReversed = temp[1];
                    if (secretMessege.indexOf(toBeReversed) != -1) {
                        int indexOfString = secretMessege.indexOf(toBeReversed);
                        String reversed = reverseString(toBeReversed);
                        secretMessege.append(reversed);
                       secretMessege.delete(indexOfString, indexOfString + toBeReversed.length());
                        System.out.println(secretMessege);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String toBeChanged = temp[1];
                    String replacement = temp[2];
                    while (secretMessege.indexOf(toBeChanged) != - 1) {
                        secretMessege.replace(secretMessege.indexOf(toBeChanged), secretMessege.indexOf(toBeChanged) + 1, replacement);
                    }
                    System.out.println(secretMessege);
                    break;
            }


            input = scan.nextLine();
        }

        System.out.println(String.format("You have a new text message: %s", secretMessege));
    }

    private static String reverseString(String toBeReversed) {
        String temp = "";
        for (int i = toBeReversed.length() -1; i >= 0; i--) {
            temp += toBeReversed.charAt(i);
        }
        return temp;
    }
}
