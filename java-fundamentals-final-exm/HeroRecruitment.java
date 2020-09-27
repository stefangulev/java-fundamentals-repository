import java.util.*;

public class HeroRecruitment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> heroList = new HashMap<>();

        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] temp = input.split(" ");
            String command = temp[0];
            String heroName = temp[1];

            switch (command) {
                case "Enroll":
                    if (heroList.containsKey(heroName)) {
                        System.out.println(String.format("%s is already enrolled.", heroName));
                    } else {
                        heroList.put(heroName, new ArrayList<>());
                    }
                    break;
                case "Learn":
                    String spellName = temp[2];
                    if (!heroList.containsKey(heroName)) {
                        System.out.println(String.format("%s doesn't exist.", heroName));
                    } else {
                        if (heroList.get(heroName).contains(spellName)) {
                            System.out.println(String.format("%s has already learnt %s.", heroName, spellName));
                        } else {
                            heroList.get(heroName).add(spellName);
                        }
                    }
                    break;
                case "Unlearn":
                    String spellToUnlearn = temp[2];
                    if (!heroList.containsKey(heroName)) {
                        System.out.println(String.format("%s doesn't exist.", heroName));
                    } else {
                        if (!heroList.get(heroName).contains(spellToUnlearn)) {
                            System.out.println(String.format("%s doesn't know %s.",heroName, spellToUnlearn));
                        } else {
                            heroList.get(heroName).remove(spellToUnlearn);
                        }
                    }
                    break;
            }


            input = scan.nextLine();
        }
        System.out.println("Heroes:");
        heroList.entrySet().stream().sorted((l, r) -> {
            int result = Integer.compare(r.getValue().size(), l.getValue().size());
            if (result == 0) {
                result = l.getKey().compareTo(r.getKey());
            }
            return result;
        }).forEach(e -> {
                System.out.println(String.format("== %s: %s", e.getKey(), e.getValue().toString().replaceAll("[\\[\\]]", "")));

        });
    }
}
