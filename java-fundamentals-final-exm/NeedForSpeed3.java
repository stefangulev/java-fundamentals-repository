import java.util.*;

public class NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scan.nextLine());
        Map<String, List<Integer>> garage = new TreeMap<>();

        for (int i = 0; i < numberOfCars; i++) {
            String[] input = scan.nextLine().split("\\|");
            String carModel = input[0];
            int mileage = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);
            List<Integer> carInfo = new ArrayList<>();
            carInfo.add(mileage);
            carInfo.add(fuel);
            garage.put(carModel, carInfo);
        }

        String input = scan.nextLine();

        while (!input.equals("Stop")) {
            String[] temp = input.split(" : ");
            String action = temp[0];
            String currentModel = temp[1];

            switch (action) {
                case "Drive":
                    int distance = Integer.parseInt(temp[2]);
                    int fuel = Integer.parseInt(temp[3]);
                    int currentFuel = garage.get(currentModel).get(1);
                    int currentMileage = garage.get(currentModel).get(0);
                    if (fuel > currentFuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int newFuel = currentFuel - fuel;
                        int newMileage = currentMileage + distance;
                        System.out.println(String.format("%s driven for %d kilometers. %d liters of fuel consumed.", currentModel,distance, fuel));
                        List<Integer> updatedCarInfo = new ArrayList<>();
                        updatedCarInfo.add(newMileage);
                        updatedCarInfo.add(newFuel);
                        if (newMileage < 100000) {
                            garage.put(currentModel, updatedCarInfo);
                        } else {
                            garage.remove(currentModel);
                            System.out.println(String.format("Time to sell the %s!", currentModel));
                        }
                    }

                    break;
                case "Refuel":
                    int fuelForRefill = Integer.parseInt(temp[2]);
                    int currentFuelAvailable = garage.get(currentModel).get(1);

                    int newFuel = 0;
                    if (fuelForRefill + currentFuelAvailable <= 75) {
                        newFuel = fuelForRefill + currentFuelAvailable;
                        System.out.println(String.format("%s refueled with %d liters", currentModel, fuelForRefill));
                    } else {
                        newFuel = 75;
                        System.out.println(String.format("%s refueled with %d liters", currentModel, 75 - currentFuelAvailable));
                    }
                    List<Integer> afterRefuel = garage.get(currentModel);
                    afterRefuel.remove(1);
                    afterRefuel.add(newFuel);
                    garage.put(currentModel, afterRefuel);


                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(temp[2]);
                    int currentMileageBeforeRevert = garage.get(currentModel).get(0);
                    int newMileage = 0;
                    if (currentMileageBeforeRevert - kilometers >= 10000) {
                        newMileage = currentMileageBeforeRevert - kilometers;
                        System.out.println(String.format("%s mileage decreased by %d kilometers", currentModel, kilometers));
                    } else {
                        newMileage = 10000;
                    }
                    List<Integer> afterRevert = garage.get(currentModel);
                    afterRevert.remove(0);
                    afterRevert.add(0, newMileage);
                    garage.put(currentModel, afterRevert);
                    break;
            }


            input = scan.nextLine();
        }
      garage.entrySet().stream().sorted((l ,r) -> {
          int result = r.getValue().get(0).compareTo(l.getValue().get(0));
          if (result == 0) {
              result = l.getKey().compareTo(r.getKey());
          }
          return result;
      }).
              forEach(e -> System.out.println(String.format("%s -> Mileage: %d kms, Fuel in the tank: %d lt.", e.getKey(), e.getValue().get(0), e.getValue().get(1))));
    }
}
