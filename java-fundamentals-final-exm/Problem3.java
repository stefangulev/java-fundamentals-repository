import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, List<Double>> plantList = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] temp = scan.nextLine().split("<->");
            String plant = temp[0];
            double rarity = Double.parseDouble(temp[1]);
            List<Double> newList = new ArrayList<>();
            newList.add(rarity);
            plantList.put(plant, newList);
        }

        String input = scan.nextLine();

        while (!input.equals("Exhibition")) {
            String[] temp = input.split(" - ");
            String[] help = temp[0].split(" ");
            String command = help[0];
            String plant = help[1];

            switch (command) {
                case "Rate:":
                    double rating = Double.parseDouble(temp[1]);
                    if (plantList.containsKey(plant)) {
                        plantList.get(plant).add(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update:":
                    double newRarity =Double.parseDouble(temp[1]);
                    if (plantList.containsKey(plant)) {
                        plantList.get(plant).add(0, newRarity);
                        plantList.get(plant).remove(1);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset:":
                    if (plantList.containsKey(plant)) {
                        double rarity = plantList.get(plant).get(0);
                        plantList.get(plant).clear();
                        plantList.get(plant).add(rarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
            }

            input = scan.nextLine();


        }

        Map<String, List<Double>> newMap = new TreeMap<>();

        for (Map.Entry<String, List<Double>> stringListEntry : plantList.entrySet()) {


                List<Double> ratings = new ArrayList<>();
                double sumRatings = 0;
                double countRatings = 0;
                for (int i = 1; i < stringListEntry.getValue().size(); i++) {
                    sumRatings += stringListEntry.getValue().get(i);
                    countRatings++;
                }
                double average = sumRatings / countRatings;
                if (countRatings == 0) {
                    average = 0.0;
                }
                ratings.add(stringListEntry.getValue().get(0));
                ratings.add(average);
                newMap.put(stringListEntry.getKey(), ratings);

            }




        System.out.println("Plants for the exhibition:");
        newMap.entrySet().stream().sorted((l, r) -> {
            int result = r.getValue().get(0).compareTo(l.getValue().get(0));
            if (result ==0 ) {
                result = r.getValue().get(1).compareTo(l.getValue().get(1));
            }
            return result;
        } ).forEach(e -> System.out.println(String.format("- %s; Rarity: %.0f; Rating: %.2f",
                e.getKey(), e.getValue().get(0), e.getValue().get(1))));




    }
}



