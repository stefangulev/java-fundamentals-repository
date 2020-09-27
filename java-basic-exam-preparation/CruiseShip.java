import java.util.Scanner;

public class CruiseShip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Напишете програма, която изчислява колко ще струва почивката на четиричленното семейство на Ани, при
        //избора на даден круиз, вид каюта и брой нощувки като знаете, че за повече от 7 нощувки има 25% отстъпка.
        //&quot;Mediterranean&quot;, &quot;Adriatic&quot;, &quot;Aegean&quot;

        String ocean = scan.nextLine();
        String cabin = scan.nextLine();
        int nightsCount = Integer.parseInt(scan.nextLine());
        int familyMembers = 4;
        double pricePerPerson = 0;

        switch (ocean) {
            case "Mediterranean":
                if (cabin.equals("standard cabin")) {
                    pricePerPerson = 27.50;
                } else if (cabin.equals("cabin with balcony")) {
                    pricePerPerson = 30.20;
                } else if (cabin.equals("apartment")) {
                    pricePerPerson = 40.50;
                }
                break;
            case "Adriatic":
                if (cabin.equals("standard cabin")) {
                    pricePerPerson = 22.99;
                } else if (cabin.equals("cabin with balcony")) {
                    pricePerPerson = 25.00;
                } else if (cabin.equals("apartment")) {
                    pricePerPerson = 34.99;
                }
                break;
            case "Aegean":
                if (cabin.equals("standard cabin")) {
                    pricePerPerson = 23.00;
                } else if (cabin.equals("cabin with balcony")) {
                    pricePerPerson = 26.60;
                } else if (cabin.equals("apartment")) {
                    pricePerPerson = 39.80;
                }
                break;
        }
        double totalPrice = familyMembers * pricePerPerson * nightsCount;
        if (nightsCount > 7) {
            totalPrice = totalPrice * 0.75;

        }
        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", ocean, totalPrice);


    }
}
