import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = scan.nextLine();

        String input = scan.nextLine();

        while (!input.equals("Complete")) {
            String[] temp = input.split(" ");
            String command = temp[0];

            switch (command) {
                case "Make":
                    String direction = temp[1];
                    if (direction.equals("Upper")) {
                        email = email.toUpperCase();
                        System.out.println(email);
                    } else if (direction.equals("Lower")) {
                        email = email.toLowerCase();
                        System.out.println(email);
                    }
                    break;
                case "GetDomain":
                    int count = Integer.parseInt(temp[1]);
                    String lastCount = email.substring(email.length() - count);
                    System.out.println(lastCount);
                    break;
                case "GetUsername":
                    int indexNeeded = email.indexOf("@");
                    if (indexNeeded != -1) {
                        String startToAt = email.substring(0, indexNeeded);
                        System.out.println(startToAt);
                    } else {
                        System.out.println(String.format("The email %s doesn't contain the @ symbol.", email));
                    }
                    break;
                case "Replace":
                    char currentChar = temp[1].charAt(0);
                    while (email.indexOf(currentChar) != -1) {
                        email = email.replace(currentChar, '-');
                    }
                    System.out.println(email);
                    break;
                case "Encrypt":
                    for (int i = 0; i < email.length(); i++) {
                        int current = email.charAt(i);
                        if (i + 1 == email.length()) {
                            System.out.println(current);
                        } else {

                            System.out.print(current + " ");
                        }

                    }
                    break;


            }
            input = scan.nextLine();
        }
    }
}
