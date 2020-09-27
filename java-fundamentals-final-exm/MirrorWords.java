import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "([# @])(?<firstWord>[A-za-z]{3,})\\1\\1(?<secondWord>[A-za-z]{3,})\\1";

        String input = scan.nextLine();
        List<String> mirror = new ArrayList<>();
        int validPairs = 0;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            validPairs++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            String reversedSecond = reverseWord(secondWord);

            if (firstWord.equals(reversedSecond)) {
                String combination = String.format("%s <=> %s", firstWord, secondWord);
                mirror.add(combination);
            }


        }
        if (validPairs == 0 ) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(String.format("%d word pairs found!", validPairs));
        }

        if (mirror.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            for (int i = 0; i <mirror.size(); i++) {
                if (i + 1 == mirror.size()) {
                    System.out.print(mirror.get(i));
                } else {
                    System.out.print(mirror.get(i) + ", ");
                }
            }
        }
    }

    private static String reverseWord(String secondWord) {
        String temp = "";

        for (int i = secondWord.length() - 1; i >= 0 ; i--) {
            temp += secondWord.charAt(i);
        }
        return temp;
    }
}
