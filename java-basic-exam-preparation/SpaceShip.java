import java.util.Scanner;

public class SpaceShip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double averageHeight = Double.parseDouble(scan.nextLine());


        //За целта, той трябва да го направи така, че да има място за поне трима астронавти, но за не повече от 10. Всеки астронавт се нуждае от малка стая, която да е с размери: 2 метра ширина, 2 метра дължина и с 40 см по-висока от средната височина на астронавтите.
        //Напишете програма, която изчислява обема на кораба, колко астронавта ще събере и принтира на конзолата дали  той е достатъчно голям.

        double spaceShipAreaInCentimeters = (width * length * height) * 100;
        double roomAreaInCentimeters = (2 * 2 * (averageHeight + 0.4)) * 100;
        double totalAstronauts = Math.floor (spaceShipAreaInCentimeters / roomAreaInCentimeters);

        if (totalAstronauts >= 3 && totalAstronauts <=10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", totalAstronauts);
        } else if (totalAstronauts < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (totalAstronauts > 10) {
            System.out.println("The spacecraft is too big.");
        }


    }
}
