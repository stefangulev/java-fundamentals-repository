package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Car> carsFiltered = new ArrayList<>();
        List<Truck> trucksFiltered = new ArrayList<>();
        int sumHorsePowerCars = 0;
        int sumHorsePowerTrucks = 0;

        while (!input.equals("End")) {
            String[] commands = input.split(" ");

            String type = commands[0];
            String model = commands[1];
            String color = commands[2];
            int horsepower = Integer.parseInt(commands[3]);



            if(type.equals("car")) {
                Car car = new Car(type, model, color, horsepower);
                carsFiltered.add(car);
                sumHorsePowerCars += car.getHorsePower();
            } else if (type.equals("truck")) {
                Truck truck = new Truck (type, model, color, horsepower);
                trucksFiltered.add(truck);
                sumHorsePowerTrucks += truck.getHorsePower();
            }

            input = scan.nextLine();
        }

        double averageHorsePowerCars = 1.0 * sumHorsePowerCars / carsFiltered.size();
        double averageHorsePowerTrucks = 1.0 * sumHorsePowerTrucks / trucksFiltered.size();

        String input2 = scan.nextLine();

        while (!input2.equals("Close the Catalogue")) {

            for (Truck truck : trucksFiltered) {
                if (input2.equals(truck.getModel())) {
                    System.out.println(truck);
                    break;
                }


                }
            for (Car car : carsFiltered) {
                if (input2.equals(car.getModel())) {
                    System.out.println(car);
                    break;
                }

            }



            input2 = scan.nextLine();
        }

        if (carsFiltered.size() <= 0) {
           averageHorsePowerCars = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsePowerCars);

        if (trucksFiltered.size() <= 0) {
            averageHorsePowerTrucks = 0;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.", averageHorsePowerTrucks);



    }
}
