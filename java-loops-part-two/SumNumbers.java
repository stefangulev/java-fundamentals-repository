import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        String input = scan.nextLine();

        while (!"Stop".equals(input)) {
            int currentNumber = Integer.parseInt(input);
            sum = sum + currentNumber;
            input = scan.nextLine();

        }
        System.out.println(sum);
    }
}
