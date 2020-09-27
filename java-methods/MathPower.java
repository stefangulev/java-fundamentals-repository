import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());

        System.out.println(new DecimalFormat("0.###").format(calculatePower(number,power)));
    }

    public static double calculatePower (double number, int power) {
double result = 1;
        for (int i = 0; i < power ; i++) {
            result *= number;
        }
return result;
    }
}
