import java.util.Scanner;

public class NxNMartix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            createMartix(n);
        }
    }

    private static void createMartix (int n) {
        for (int i = 0; i < n ; i++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
