import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scan.nextLine());
        int cakeLength = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int cakeSize = cakeWidth * cakeLength;
        int cakeTaken = 0;
        int cakeCurrent = 0;
        int difference = 0;

        while (!input.equals("STOP")) {
            int slicesNumber = Integer.parseInt(input);
            cakeTaken = cakeTaken + slicesNumber;
            cakeCurrent = cakeSize - cakeTaken;

            if (cakeCurrent <= 0) {
                break;
            }
            input = scan.nextLine();
        }

        if (cakeCurrent <= 0) {
            difference = cakeTaken - cakeSize;
            System.out.printf("No more cake left! You need %d pieces more.", difference);
        } else {
            difference = cakeSize - cakeTaken;
            System.out.printf("%d pieces are left.", difference);

        }



    }
}
