import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int synonymPairsCount = Integer.parseInt(scan.nextLine());

        Map<String, List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i <synonymPairsCount ; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            if (!synonyms.containsKey(word)) {
                List<String> synonymList = new ArrayList<>();
                synonymList.add(synonym);
                    synonyms.put(word, synonymList);
            } else {
                List<String> currentSynonyms = synonyms.get(word);
                currentSynonyms.add(synonym);
                synonyms.put(word, currentSynonyms);
            }
        }

        for (Map.Entry<String, List<String>> stringListEntry : synonyms.entrySet()) {
            String printSynonyms = stringListEntry.getValue().toString().replaceAll("[\\[\\]]" , "");
            System.out.printf("%s - %s%n", stringListEntry.getKey(), printSynonyms);
        }

    }
}
