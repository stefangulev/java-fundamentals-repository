import java.util.*;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        double sumOfElements = 0;

        for (Integer integer : list) {
            sumOfElements += integer;
        }

        double averageValue = sumOfElements / list.size();


        List<Integer> biggerNumber = new ArrayList<>();
        for (Integer integer : list) {
            if (integer > averageValue) {
                biggerNumber.add(integer);
            }

        }

        if (biggerNumber.size() == 0) {
            System.out.println("No");
            return;
        }

        Collections.sort(biggerNumber, (a1 , a2) -> a2.compareTo(a1));
        int countOfBiggerNumbersPrinted = 0;
        for (Integer integer : biggerNumber) {
            System.out.print(integer + " ");
            countOfBiggerNumbersPrinted++;
            if (countOfBiggerNumbersPrinted == 5) {
                break;
            }
        }


    }
}
