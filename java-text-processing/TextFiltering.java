import java.util.Scanner;

public class TextFiltering {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] bannedWords = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (int i = 0; i <bannedWords.length; i++) {
            String replacement = asterisksReplacement(bannedWords[i].length());

            text = text.replace(bannedWords[i], replacement);
        }
        System.out.println(text);


    }

    private static String asterisksReplacement (int wordSize) {
        String result = "";

        for (int i = 0; i <wordSize; i++) {
            result += "*";
        }
        return result;
    }
}
