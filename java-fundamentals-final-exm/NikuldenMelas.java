import javax.crypto.spec.PSource;
import java.util.*;

public class NikuldenMelas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> guestList = new HashMap<>();

        String input = scan.nextLine();
        int unlikedMealsCount = 0;

        while (!input.equals("Stop")) {
            String[] temp = input.split("-");
            String command = temp[0];
            String guestName = temp[1];
            String meal = temp[2];

            if (command.equals("Like")) {

                guestList.putIfAbsent(guestName, new ArrayList<>());
                if(!guestList.get(guestName).contains(meal)) {
                    guestList.get(guestName).add(meal);
                }

            } else if (command.equals("Unlike")) {
                if (guestList.containsKey(guestName)) {
                    if (guestList.get(guestName).contains(meal)) {
                        unlikedMealsCount++;
                        System.out.println(String.format("%s doesn't like the %s.", guestName, meal));
                        guestList.get(guestName).remove(meal);
                    } else {
                        System.out.println(String.format("%s doesn't have the %s in his/her collection.", guestName, meal));
                    }
                } else {
                    System.out.println(String.format("%s is not at the party.", guestName));
                }
            }


            input = scan.nextLine();
        }

        guestList.entrySet().stream().sorted((l ,r ) -> {
            int result = Integer.compare(r.getValue().size(), l.getValue().size());
            if (result == 0) {
                result = l.getKey().compareTo(r.getKey());
            }
            return result;
        }).forEach(e -> System.out.println(String.format("%s: %s", e.getKey(), e.getValue().toString().replaceAll("[\\[\\]]", ""))));

        System.out.println(String.format("Unliked meals: %d", unlikedMealsCount));
    }
}
