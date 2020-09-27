import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbersLyubo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] special = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int specialNumber = special[0];
        int power = special[1];

        while (numbers.contains(specialNumber)) {
            int bombIndex = numbers.indexOf(specialNumber);

            int leftBorder = Math.max(bombIndex - power, 0);
            int rightBorder = Math.min(bombIndex + power, numbers.size()-1 );

            for (int i = rightBorder; i >= leftBorder; i--) {
                numbers.remove(i);

            }
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
