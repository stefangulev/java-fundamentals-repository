import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> rankings = new LinkedHashMap<>();

        String regexLetters = "(?<letters>[A-Za-z])";
        String regexNumbers = "(?<numbers>[0-9])";

        Pattern patternLetters = Pattern.compile(regexLetters);
        Pattern patternNumbers = Pattern.compile(regexNumbers);

        String[] racers = scan.nextLine().split(", ");
        String input = scan.nextLine();

        while (!input.equals("end of race")) {
            StringBuilder nameOfRacer = new StringBuilder();
            int totalDistance = 0;
            Matcher matcherLetters = patternLetters.matcher(input);
            Matcher matcherNumbers = patternNumbers.matcher(input);

            while (matcherLetters.find()) {
                nameOfRacer.append(matcherLetters.group(0));
            }
            while (matcherNumbers.find()) {
                totalDistance += Integer.parseInt(matcherNumbers.group(0));
            }
            for (String racer : racers) {
                if (racer.equals(String.valueOf(nameOfRacer))) {
                    if (rankings.containsKey(String.valueOf(nameOfRacer))) {
                        int currentDistance = rankings.get(String.valueOf(nameOfRacer));
                        rankings.put(String.valueOf(nameOfRacer), totalDistance + currentDistance);

                    } else {
                        rankings.put(String.valueOf(nameOfRacer), totalDistance);
                    }
                }


            }

            input = scan.nextLine();



        }


        List<String> output = new ArrayList<>();
        output.add("1st place: ");
        output.add("2nd place: ");
        output.add("3rd place: ");

        rankings.entrySet().stream().sorted((l ,r) -> r.getValue().compareTo(l.getValue())).limit(3)
                .forEach(e -> System.out.println(output.remove(0) + e.getKey()));
    }
}
