import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Merging {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = mergeLists(first, second);

        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));


    }

    private static List<Integer> mergeLists(List<Integer> first, List<Integer> second) {
        List<Integer> result = new ArrayList<>();
        int lowerLength = Math.min(first.size(), second.size());

        for (int i = 0; i < lowerLength; i++) {
            result.add(first.get(i));
            result.add(second.get(i));
        }

        if (first.size() > second.size()) {
            for (int i = lowerLength; i < first.size(); i++) {
                result.add(first.get(i));
            }
        } else if (first.size() < second.size()) {
            for (int i = lowerLength; i < second.size(); i++) {
                result.add(second.get(i));


            }




        }
        return result;
    }
}