import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int oddSum = sumOddNumbers(number);
        int evenSum = sumEvenNumbers(number);
        System.out.println(oddSum * evenSum);
    }

    private static int sumOddNumbers(int number) {
        int sumOdd = 0;
        int length = Integer.toString(number).length();
        for (int i = 0; i < length; i++) {
            int currentNumber = number % 10;
            number /= 10;
            if (currentNumber % 2 != 0) {
                sumOdd += currentNumber;
            }
        }
        return sumOdd;
    }

    private static int sumEvenNumbers(int number) {
        int sumEven = 0;
        int length = Integer.toString(number).length();
        for (int i = 0; i < length; i++) {
            int currentNumber = number % 10;
            number /= 10;
            if (currentNumber % 2 == 0) {
                sumEven += currentNumber;
            }
        }
        return sumEven;
    }

}
