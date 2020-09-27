import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String keyWord = scan.nextLine();
        String input = scan.nextLine();
        String result = input;

        while (result.indexOf(keyWord) != -1) {

            result = result.substring(0, result.indexOf(keyWord)) + result.substring(result.indexOf(keyWord) + keyWord.length());
        }

        System.out.println(result);
    }
}
