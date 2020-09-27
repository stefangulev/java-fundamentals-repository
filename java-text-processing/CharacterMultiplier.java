import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        int sum = multiplier(input[0], input[1]);
        System.out.println(sum);


    }


    private static int multiplier (String first, String second) {
        int shorterLength =  first.length();
        int longerLength = second.length();
        if (second.length() < first.length()) {
            shorterLength = second.length();
            longerLength = first.length();
        }
        int sum = 0;
        for (int i = 0; i < shorterLength ; i++) {
            char firstChar = first.charAt(i);
            char secondChar = second.charAt(i);

            sum += firstChar * secondChar;
        }
        if (first.length() > second.length()) {
            for (int i = shorterLength; i < longerLength ; i++) {
                sum += first.charAt(i);
            }
        } else if (second.length() > first.length()) {
            for (int i = shorterLength; i < longerLength; i++) {
                sum += second.charAt(i);
            }
        }

        return sum;
    }
}
