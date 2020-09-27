import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        printSmallestNumber(firstNumber,secondNumber,thirdNumber);
    }
    private static void printSmallestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int smallestNumber = firstNumber;

        if (firstNumber > secondNumber && thirdNumber > secondNumber) {
            smallestNumber = secondNumber;
        } else if (firstNumber > thirdNumber && secondNumber > thirdNumber ) {
            smallestNumber = thirdNumber;
        }
        System.out.println(smallestNumber);

    }
}
