import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= first; i++) {
            for (int j = 1; j <= first; j++) {
                for (char k = 'a'; k < 'a' + second; k++) {
                    for (char l = 'a'; l < 'a' + second; l++) {
                        for (int m = Math.max(i , j) + 1; m <= first; m++) {
                            System.out.printf("%d%d%c%c%d ", i , j, k, l ,m);

                        }
                    }
                }

            }
        }
    }
}
