import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(e -> Double.parseDouble(e)).toArray();

        Map<Double, Integer> occurrences = new TreeMap<>();

        for (Double number : numbers) {

            if (!occurrences.containsKey(number)) {
                occurrences.put(number, 1);
            } else {
                int currentValue = occurrences.get(number) + 1;
                occurrences.put(number, currentValue);
            }
        }

        for (Map.Entry<Double, Integer> doubleIntegerEntry : occurrences.entrySet()) {
            System.out.printf("%.0f -> %d%n", doubleIntegerEntry.getKey(), doubleIntegerEntry.getValue());
        }
    }
}
