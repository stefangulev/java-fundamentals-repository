import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = scan.nextLine();
        String inputPassword = scan.nextLine();

        while (!password.equals(inputPassword)) {
            inputPassword = scan.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
