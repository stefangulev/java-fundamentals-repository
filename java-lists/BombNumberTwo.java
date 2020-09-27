import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumberTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] special = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int specialNumber = special[0];
        int power = special[1];

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i).equals(specialNumber)) {

                for (int j = i; j <= i + power ; j++) {

                    if (j > numbers.size()) {
                        break;
                    } else {
                        numbers.remove(i);
                    }
                }
                int currentNumber = i;
                for (int j = power; j > 0; j--) {
                    currentNumber -=1;
                    if (currentNumber < 0) {
                        break;
                    } else {
                        numbers.remove(currentNumber);

                    }

                }


            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum +=number;
        }
        System.out.println(sum);
    }
}