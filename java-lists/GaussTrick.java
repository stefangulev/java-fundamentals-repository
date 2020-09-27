import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> newNumbers = gauss(numbers);

        for (Integer newNumber : newNumbers) {
            System.out.print(newNumber + " ");
        }

    }

    public static List<Integer> gauss (List<Integer> numbers) {

        int size = numbers.size()/2;

        for (int i = 0; i < size; i++) {
            int currentIndex = i;
            int lastIndex = numbers.size() - 1;

            numbers.set(i, numbers.get(currentIndex) + numbers.get(lastIndex));
            numbers.remove(lastIndex);
        }
        return numbers;
    }
}
