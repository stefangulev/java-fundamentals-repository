import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        printSign(n);
    }

    private static void printSign(int n) {
        String sign = "zero";
        if (n > 0) {
            sign = "positive";
        } else if (n < 0) {
            sign = "negative";
        }
        System.out.printf("The number %d is %s.", n, sign);
    }
}


