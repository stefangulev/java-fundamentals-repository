import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= n; i++) {
            int currentNum = i;
            int currentDigit = i % 10;
            currentNum /= 10;
          double sum = Math.floor(currentDigit + currentNum);

            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;

            if (isSpecial) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }



        }


    }
}
