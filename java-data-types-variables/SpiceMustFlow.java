import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startingYield = Integer.parseInt(scan.nextLine());
        int currentMined = 0;
        int daysCount = 0;

        while (startingYield >= 100) {
            currentMined += startingYield;
            currentMined -= 26;
            startingYield -= 10;
            daysCount++;

        }
        if (currentMined != 0) {
            currentMined -= 26;
        }

        System.out.println(daysCount);
        System.out.println(currentMined);
    }
}
