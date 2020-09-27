import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> materialsCount = new LinkedHashMap<>();
        int materialsLeft = 0;
        String itemName = "";

        String levski = "";
        boolean isDone = false;

        while (!isDone) {
            List<String> materials = new ArrayList<>();
            List<Integer> values = new ArrayList<>();

            String[] input = scan.nextLine().toLowerCase().split(" ");
            for (int i = 0; i < input.length; i++) {
                if (i % 2 == 0) {
                    int currentValue = Integer.parseInt(input[i]);
                    values.add(currentValue);
                } else {
                    materials.add(input[i]);
                }
            }
            for (int i = 0; i <materials.size(); i++) {

                String material = materials.get(i);
                int value = values.get(i);
                int newValue = 0;
                if (!materialsCount.containsKey(material)) {
                    materialsCount.put(material, value);
                } else {
                    newValue = materialsCount.get(material) + value;
                    materialsCount.put(material, newValue);

                }
                if (newValue > 250 || value > 250) {
                    if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                        break;
                    }
                }


            }
            for (Map.Entry<String, Integer> entry : materialsCount.entrySet()) {
                if (entry.getKey().equals("motes") || entry.getKey().equals("shards") || entry.getKey().equals("fragments")) {
                    if (entry.getValue() >= 250) {
                        itemName = entry.getKey();
                        materialsLeft = entry.getValue() - 250;
                        materialsCount.put(entry.getKey(), materialsLeft);
                        isDone = true;
                        break;
                    }
                }
            }

            }

        Map<String, Integer> specialItems = new TreeMap<>();
        specialItems.put("motes", 0);
        specialItems.put("shards", 0);
        specialItems.put("fragments", 0);
        Map<String, Integer> junkItems = new TreeMap<>();

        for (Map.Entry<String, Integer> entry : materialsCount.entrySet()) {
            if (entry.getKey().equals("motes") || entry.getKey().equals("shards") || entry.getKey().equals("fragments")) {
                specialItems.put(entry.getKey(), entry.getValue());
            } else {
                junkItems.put(entry.getKey(), entry.getValue());
            }
        }

        if (itemName.equals("shards")) {
            System.out.println("Shadowmourne obtained!");
        } else if(itemName.equals("motes")) {
            System.out.println("Dragonwrath obtained!");
        } else if(itemName.equals("fragments")) {
            System.out.println("Valanyr obtained!");
        }

        specialItems.entrySet().stream().sorted((l, r) -> {
            int result = r.getValue().compareTo(l.getValue());
            if (result == 0) {
                result = l.getKey().compareTo(r.getKey());
            }
            return result;
        }).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        junkItems.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));









        }

    }

