import java.util.Scanner;
public class SumPrimeNumber1 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;
        boolean isPrime = false;
        boolean isNegative = false;

        while (!input.equals("stop")) {
            int numbers = Integer.parseInt(input);
            while (numbers < 0) {
                System.out.println("Number is negative.");
                numbers = 0;

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
            if (numbers == 2) {
                isPrime = true;
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


