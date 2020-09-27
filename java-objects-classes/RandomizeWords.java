import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");

        Random rand = new Random();

        for (int i = 0; i < words.length; i++) {
            int randomNumber = rand.nextInt(words.length);
            String currentIndex = words[i];
            words[i] = words[randomNumber];
            words[randomNumber] = currentIndex;

        }

        printWords(words);

    }

    private static void printWords(String[] words) {
        for (int i = 0; i < words.length ; i++) {
            System.out.println(words[i]);
        }
    }
}
