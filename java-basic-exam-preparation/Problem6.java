import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maxNumber1 = Integer.parseInt(scan.nextLine());
        int maxNumber2 = Integer.parseInt(scan.nextLine());
        int maxNumber3 = Integer.parseInt(scan.nextLine());
        boolean isEven = false;
        boolean isPrime = false;
        boolean isEven2 = false;

        for (int i = 1; i <= maxNumber1; i++) {
            if (i % 2 ==0) {
                isEven = true;
            } else {
                isEven = false;
            }

            for (int j = 1; j <= maxNumber2; j++) {
                if (j == 2 || j == 3 || j ==5 || j ==7) {
                    isPrime = true;

                    } else {
                    isPrime = false;
                }

                for (int k = 1; k <= maxNumber3; k++) {
                    if (k % 2 == 0) {
                        isEven2 = true;
                    } else {
                        isEven2 = false;
                    }
                   if (isEven && isPrime && isEven2) {
                       System.out.printf("%d %d %d%n", i, j, k);

                   }

                }
            }
        }
    }
}
