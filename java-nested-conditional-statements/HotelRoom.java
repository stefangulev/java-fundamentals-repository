import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nightsCnt = Integer.parseInt(scan.nextLine());
        double pricePerNightApartment = 0;
        double pricePerNightStudio = 0;
        double totalPriceApartment = 0;
        double totalPriceStudio = 0;



        if (month.equals("May") || month.equals("October")) {
            pricePerNightStudio = 50;
            pricePerNightApartment = 65;
            if (nightsCnt > 7 && nightsCnt <= 14) {
                pricePerNightStudio = pricePerNightStudio * 0.95;
            } else if (nightsCnt > 14 ) {
                pricePerNightStudio = pricePerNightStudio * 0.70;
            }
        } else if (month.equals("June") || month.equals("September")) {
            pricePerNightStudio = 75.20;
            pricePerNightApartment = 68.70;
            if (nightsCnt > 14) {
                pricePerNightStudio = pricePerNightStudio * 0.80;
            }
        } else if (month.equals("July") || month.equals("August")) {
            pricePerNightStudio = 76;
            pricePerNightApartment = 77;
        } if (nightsCnt > 14) {
            pricePerNightApartment = pricePerNightApartment * 0.90;
        } totalPriceApartment = pricePerNightApartment * nightsCnt;
        totalPriceStudio = pricePerNightStudio * nightsCnt;
        System.out.printf("Apartment: %.2f lv.", totalPriceApartment);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", totalPriceStudio);


    }
}
