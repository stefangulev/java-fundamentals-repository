import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().toLowerCase().split(" ");

        Map<String, Integer> occurrences = new LinkedHashMap<>();

        for (String word : words) {
            if (!occurrences.containsKey(word)) {
                occurrences.put(word, 1);
            } else {
               int currentValue =  occurrences.get(word) + 1;
               occurrences.put(word, currentValue);
            }
        }

        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() % 2 != 0 ) {
                odds.add(entry.getKey());
            }
        }
        for (int i = 0; i < odds.size(); i++) {
            if (i + 1 == odds.size()) {
                System.out.print(odds.get(i));
            } else {
                System.out.print(odds.get(i) + ", ");
            }
        }
    }
}
