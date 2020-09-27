import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstNumber = scan.nextLine();
        String secondNumber = scan.nextLine();

        BigInteger first = new BigInteger(firstNumber);
        BigInteger second = new BigInteger(secondNumber);

        BigInteger sum = first.add(second);

        System.out.println(sum);
    }
}
