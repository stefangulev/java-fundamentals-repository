import java.util.Scanner;

public class ReplaceRepeatingChars2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            if (sb.length() == 0) {
                sb.append(currentChar);
            } else {
                if (sb.charAt(sb.length() -1) != currentChar) {
                    sb.append(currentChar);
                }
            }
        }
        System.out.println(sb);



    }
}
