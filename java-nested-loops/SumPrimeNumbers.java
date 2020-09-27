import java.util.Scanner;

public class SumPrimeNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;
        boolean isPrime = false;
        boolean isNegative = false;

        while (!input.equals("stop")) {

            if (isNegative){
                input = scan.nextLine();
            }

            int numbers = Integer.parseInt(input);

            if (numbers < 0) {
                System.out.println("Number is negative.");
                isNegative = true;
                continue;
            }

            for (int i = 2; i < numbers; i++) {

                if (numbers % i != 0) {
                    isPrime = true;

                } else {
                    isPrime = false;
                }
                if (!isPrime) {
                    break;
                }
            }

            if (isPrime) {
                sumPrime = sumPrime + numbers;
            } else {
                sumNonPrime = sumNonPrime + numbers;
            }

            input = scan.nextLine();

        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);
    }
}
