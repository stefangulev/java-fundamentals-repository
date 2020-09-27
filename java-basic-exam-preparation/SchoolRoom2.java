import java.util.Scanner;

public class SchoolRoom2 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            double h = Double.parseDouble(scan.nextLine());
            double w = Double.parseDouble(scan.nextLine());

            double wInCm = w * 100;
            double hInCm = h * 100;

            double actualW = wInCm - 100;
            double countW = Math.floor(actualW / 70);

            double actualH = Math.floor(hInCm / 120);

            double totalCount = actualH * countW - 3;

            System.out.printf("%.0f", totalCount);
        }
    }
