import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyAvailable = Double.parseDouble(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());
        double lightSaberPrice = Double.parseDouble(scan.nextLine());
        double robePrice = Double.parseDouble(scan.nextLine());
        double beltPrice = Double.parseDouble(scan.nextLine());
double beltTotal = 0;
        double lightSaberTotal = lightSaberPrice * Math.ceil(studentsCount * 1.1);
        double robeTotal = robePrice * studentsCount;
        if (studentsCount >= 6) {
            beltTotal = beltPrice * (studentsCount - (Math.floor(studentsCount / 6.0)));
        } else {
            beltTotal = beltPrice * studentsCount;
        }
        double total = lightSaberTotal + robeTotal + beltTotal;

       if (total <= moneyAvailable) {
           System.out.printf("The money is enough - it would cost %.2flv.", total);
       } else {
           double diff = total - moneyAvailable;
           System.out.printf("Ivan Cho will need %.2flv more.", diff);
       }
    }
}
