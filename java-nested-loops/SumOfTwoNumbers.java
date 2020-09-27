import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int finish = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        int count = 0;
        boolean flag = false;

        for (int x1 = start; x1 <= finish; x1++) {
            for (int x2 = start; x2 <= finish; x2++) {
                int result = x1 + x2;
                count++;
                if (result == magicNumber) {
                    flag = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, x1, x2, result);
                    break;

                }

            }
            if (flag) {
                break;
            }
        }
        if (!flag)
        System.out.printf("%d combinations - neither equals %d", count, magicNumber);
    }
}
