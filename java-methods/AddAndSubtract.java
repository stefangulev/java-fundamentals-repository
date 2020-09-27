import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        int sumOfTwo = sumFirstTwoIntegers(firstNumber, secondNumber);

        int finalResult = subtractThirdFromSumOfTwo(sumOfTwo, thirdNumber);
        System.out.println(finalResult);
    }

    private static int sumFirstTwoIntegers (int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }
    private static int subtractThirdFromSumOfTwo (int sumOfTwo, int thirdNumber) {
        int sum = sumOfTwo - thirdNumber;
        return sum;
    }
}
