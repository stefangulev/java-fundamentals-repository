import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;

        while(n != 0) {

            int currentDigit = n % 10;
            sum += currentDigit;
            n /= 10;

        }
        System.out.println(sum);
    }
}
