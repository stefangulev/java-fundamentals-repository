import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toLowerCase();

        printCountOfVowels(input);
    }
    private static void printCountOfVowels(String input) {
        int vowelsCount = 0;
        for (int i = 0; i <input.length(); i++) {
            char currentChar = input.charAt(i);
            if(currentChar == 'a' || currentChar =='e' || currentChar == 'o' || currentChar == 'i' || currentChar == 'u') {
                vowelsCount +=1;
            }
        }
        System.out.println(vowelsCount);
    }
}
