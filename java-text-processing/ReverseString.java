import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        String input = scan.nextLine();

        while (!input.equals("end")) {
            String reversed = reverseWords(input);
            System.out.printf("%s = %s%n", input, reversed);
            input = scan.nextLine();
        }


    }

    private static String reverseWords (String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }
}
