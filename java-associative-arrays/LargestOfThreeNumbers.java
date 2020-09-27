import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).
                sorted((l, r) -> r.compareTo(l)).limit(3).forEach(e -> System.out.print(e + " "));
    }
}
