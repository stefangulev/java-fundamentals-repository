import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        printTopNumber(number);
    }

    private static void printTopNumber (int number) {
        boolean hasOddDigits = false;
        boolean isDivisible = false;
        for (int i = 1; i <= number; i++) {
            int sum = sumOfNumbers(i);
            if (sum % 8 == 0) {
                isDivisible = true;
            } else {
                isDivisible = false;
            }
            hasOddDigits = hasOddDigit(i);
            if (hasOddDigits && isDivisible) {
                System.out.println(i);
            }

        }

    }


    private static int sumOfNumbers (int n) {

        String length = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < length.length(); i++) {

            int currentNumber = n;
            int digit = currentNumber % 10;
            n /= 10;
            sum += digit;
        } return sum;
    }
    private static boolean hasOddDigit (int n) {
        boolean hasOddDigit = false;
        String length = String.valueOf(n);
        for (int i = 0; i < length.length(); i++) {
            int currentNumber = n;
            int digit = currentNumber % 10;
            currentNumber /= 10;
            if (digit % 2 !=0) {
                hasOddDigit = true;
                break;
            }
            }
        return hasOddDigit;
        }
    }
