import java.util.Scanner;

public class PasswordMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String password = scan.nextLine();
        String inputPassword = scan.nextLine();

        while (!inputPassword.equals(password)) {
            inputPassword = scan.nextLine();
        }
        System.out.printf("Welcome %s!", username);

    }
}
