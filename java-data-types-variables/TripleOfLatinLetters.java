import java.util.Scanner;

public class TripleOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = (int) 'a'; i < (int)('a' + n); i++) {

            for (int j = (int) 'a'; j < (int) ('a' +n) ; j++) {

                for (int k = (int) 'a'; k <  (int) ('a' + n) ; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }
    }
}
