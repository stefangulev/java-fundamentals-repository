import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine().replaceAll(" ", "");

        Map<Character, Integer> charactersData = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.charAt(i);
            if (!charactersData.containsKey(currentChar)) {
                charactersData.put(currentChar, 1);
            } else {
                int newValue  = charactersData.get(currentChar) + 1;
                charactersData.put(currentChar, newValue);
            }


            }
        for (Map.Entry<Character, Integer> characterIntegerEntry : charactersData.entrySet()) {
            System.out.println(characterIntegerEntry.getKey() + " -> " + characterIntegerEntry.getValue());

        }


    }
}
