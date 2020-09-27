import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        int originalN = n;

        int pokedCount = 0;

        while (n >= m) {
            n -= m;
            pokedCount++;

            if (n == originalN * 0.5 && y != 0) {
                n /= y;
            }

        }
        System.out.println(n);
        System.out.println(pokedCount);
    }
}
