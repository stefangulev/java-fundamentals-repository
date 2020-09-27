import java.util.*;

public class Pirates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Map<String, List<Integer>> cities = new TreeMap<>();

        String input = scan.nextLine();

        while (!input.equals("Sail")) {
            String[] parts = input.split("\\|\\|");
            String name = parts[0];
            int population = Integer.parseInt(parts[1]);
            int gold = Integer.parseInt(parts[2]);

            List<Integer> temp = new ArrayList<>();
            temp.add(population);
            temp.add(gold);
            if (!cities.containsKey(name)) {
                cities.put(name, temp);
            } else {
                List<Integer> current = cities.get(name);
                current.add(current.get(0) + population);
                current.add(current.get(1) + gold);
                current.remove(0);
                current.remove(0);
                cities.put(name, current);
            }

            input = scan.nextLine();
        }

        String input2 = scan.nextLine();
        while (!input2.equals("End")) {
            String[] commands = input2.split("=>");
            String instruction = commands[0];
            String townName = commands[1];

            switch (instruction) {
                case "Plunder":
                    int people = Integer.parseInt(commands[2]);
                    int gold = Integer.parseInt(commands[3]);
                    if (cities.containsKey(townName)) {
                        List<Integer> currentTemp = new ArrayList<>();
                       currentTemp.add(cities.get(townName).get(0) - people);
                        currentTemp.add(cities.get(townName).get(1) - gold);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", townName, gold, people);
                        cities.put(townName, currentTemp);
                        for (Integer integer : currentTemp) {
                            if (integer <= 0) {
                                cities.remove(townName);
                                System.out.printf("%s has been wiped off the map!%n", townName);
                            }
                        }


                    }
                    break;
                case "Prosper":
                    int prosperGold = Integer.parseInt(commands[2]);
                    if (prosperGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        List<Integer> prosperList = new ArrayList<>();
                        prosperList.add(cities.get(townName).get(0));
                        prosperList.add(cities.get(townName).get(1) + prosperGold);
                        cities.put(townName, prosperList);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", prosperGold, townName, prosperList.get(1));

                    }

                    break;
            }
            input2 = scan.nextLine();
        }

        if (cities.size() == 0) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
            return;
        }
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());
        cities.entrySet().stream().sorted((l,r) -> r.getValue().get(1).compareTo(l.getValue().get(1))).
                forEach(e -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", e.getKey(), e.getValue().get(0), e.getValue().get(1)));

    }
}
