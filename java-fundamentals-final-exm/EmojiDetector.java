import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String emojiRegex = "([\\:\\*]){1}\\1{1}(?<word>[A-Z]{1}[a-za-z]{2,})([\\:\\*]){1}\\1{1}";
        String digitsRegex = "\\d";

        String text = scan.nextLine();
        List<String> emojiList = new ArrayList<>();
        List<String> onlyWordsEmoji = new ArrayList<>();

        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(text);

        while (emojiMatcher.find()) {
            emojiList.add(emojiMatcher.group());
            onlyWordsEmoji.add(emojiMatcher.group("word"));
        }
        Pattern digitsPattern = Pattern.compile(digitsRegex);
        Matcher digitsMatcher = digitsPattern.matcher(text);
        BigInteger coolTreshold = new BigInteger("1");
        while (digitsMatcher.find()) {
            BigInteger temp = new BigInteger(digitsMatcher.group());
            coolTreshold = coolTreshold.multiply(temp);
        }

       List<String> coolEmojis = new ArrayList<>();

        for (String s : emojiList) {
            BigInteger temp = new BigInteger("0");
            for (int i = 2; i < s.length() -2; i++) {

                int num = s .charAt(i);
                BigInteger value = new BigInteger(String.valueOf(num));
                 temp = temp.add(value);
            }
            if (temp.compareTo(coolTreshold) > -1) {
                coolEmojis.add(s);
            }
        }

        System.out.println("Cool threshold: " + coolTreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojiList.size());
        for (String coolEmoji : coolEmojis) {
            System.out.println(coolEmoji);
        }
    }
}
