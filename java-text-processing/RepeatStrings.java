import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length() ; j++) {
                result.append(input[i]);
            }
        }

        System.out.println(result);
    }
}
