import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxWagonCapacity = Integer.parseInt(scan.nextLine());

        String[] input = scan.nextLine().split(" ");
        while(!input[0].equals("end")) {

            if (input[0].equals("Add")) {
                int newWagon = Integer.parseInt(input[1]);
                train.add(newWagon);
            } else {
                for (int i = 0; i < train.size(); i++) {
                    int passengers = Integer.parseInt(input[0]);
                    if (train.get(i) + passengers <= maxWagonCapacity) {
                        int combined = train.get(i) + passengers;
                        train.set(i, combined);
                        break;

                    }
                }
            }

            input = scan.nextLine().split(" ");
        }
        for (Integer n : train) {
            System.out.print(n + " ");
        }
    }
}
