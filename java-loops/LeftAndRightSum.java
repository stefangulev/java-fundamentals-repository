import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int currentNumber = 0;
        int totalSumLeftSide = 0;
        int totalSumRightSide = 0;
        int diff = 0;

        for (int i = 0; i <n; i++ ) {
            currentNumber = Integer.parseInt(scan.nextLine());
            totalSumLeftSide = totalSumLeftSide + currentNumber;
        }
        for (int j = 0; j<n; j ++) {
            currentNumber = Integer.parseInt(scan.nextLine());
            totalSumRightSide = totalSumRightSide + currentNumber;
        }
        if (totalSumLeftSide == totalSumRightSide) {
            System.out.println("Yes, sum = " + totalSumLeftSide);
        } else {
            diff = totalSumLeftSide - totalSumRightSide;
            System.out.printf("No, diff = " + Math.abs(diff));
        }
    }
}
