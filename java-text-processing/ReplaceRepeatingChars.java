import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sb = scan.nextLine();

        for (int i = 0; i < sb.length() - 1; i++) {
            String current = String.valueOf(sb.charAt(i));
            String next = String.valueOf(sb.charAt(i + 1));

            if (current.equals(next)) {
                int startIndex = i;
                int end = i + 1;
                if (end + 1 < sb.length()) {
                    while (sb.charAt(startIndex) == sb.charAt(end)) {
                        end += 1;
                    }


                    String temp = sb.substring(startIndex, end);

                    sb = sb.replace(temp, current);
                } else {
                    sb += current;
                    String temp = sb.substring(startIndex, end + 1);
                    sb = sb.replace(temp, "");

                }
            }
        }
        System.out.println(sb);




    }
}
