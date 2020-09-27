import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumLeftSide = 0;
        int sumRightSide = 0;
        boolean isEqual = false;
        int index = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (sumLeftSide != sumRightSide) {
                sumLeftSide = 0;
                sumRightSide = 0;

            }

            for (int j = i - 1; j >= 0; j--) {
                sumLeftSide += numbers[j];
            }
            for (int k = i + 1; k < numbers.length; k++) {
                sumRightSide += numbers[k];

            }
            if (sumLeftSide == sumRightSide) {
                isEqual = true;
                System.out.println(i);
                return;
            }
        }


        if (sumLeftSide == 0 && sumRightSide == 0) {
            System.out.println(0);
        } else {
            System.out.println("no");
        }


    }
}