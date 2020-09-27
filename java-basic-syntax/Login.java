import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String reversed = "";

        for (int i = username.length() - 1; i >= 0 ; i--) {
            reversed += username.charAt(i);
        }

        String input = scan.nextLine();
        int count = 0;
        boolean isBlocked = false;

        while (!input.equals(reversed)) {
            count++;
            if (count == 4) {
                isBlocked = true;
                System.out.printf("User %s blocked!", username);
                break;
            }

            System.out.println("Incorrect password. Try again.");

            input = scan.nextLine();
        }

        if (!isBlocked) {
            System.out.printf("User %s logged in.", username);
        }


    }
}
