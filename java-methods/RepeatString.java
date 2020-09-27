import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int repeatCount = Integer.parseInt(scan.nextLine());

        String result = repeatString(input, repeatCount);
        System.out.println(result);

    }
    public static String repeatString (String input, int repeatCount) {
        String repeated = "";
        for (int i = 0; i < repeatCount ; i++) {
            repeated += input;
        }
        return repeated;
    }

}
