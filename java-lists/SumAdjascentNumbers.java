import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjascentNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> number = Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < number.size() - 1; i++) {
            double currentIndex = number.get(i);
            double secondIndex = number.get(i + 1);
            if (currentIndex == secondIndex) {
                number.remove(secondIndex);
                number.set(i, currentIndex + secondIndex);
                i = -1;
            }
        }
        String delimeter = " ";

       String output =  printElementsByDecimal (number, delimeter);
        System.out.println(output);
    }

    public static String printElementsByDecimal (List<Double> numbers, String delimeter) {
        String output = "";

        for (Double number : numbers) {
            output += (new DecimalFormat("0.#").format(number) + delimeter);
        }
        return output;
    }
}
