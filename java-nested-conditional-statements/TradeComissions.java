import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double salesCnt = Double.parseDouble(scan.nextLine());
        double comission = 0;
        double totalPrice = 0;
        if (!city.equals("Sofia") && !city.equals("Varna") && !city.equals("Plovdiv") || salesCnt < 0) {
            System.out.println("error");
        } else if (city.equals("Sofia")) {
            if (salesCnt >= 0 && salesCnt <= 500) {
                comission = 0.05;
            } else if (salesCnt > 500 && salesCnt <= 1000) {
                comission = 0.07;
            } else if (salesCnt > 1000 && salesCnt <= 10000) {
                comission = 0.08;
            } else if (salesCnt > 10000) {
                comission = 0.12;

            }
            totalPrice = comission * salesCnt;
            System.out.printf("%.2f", totalPrice);

        } else if (city.equals("Varna")) {
            if (salesCnt >= 0 && salesCnt <= 500) {
                comission = 0.045;
            } else if (salesCnt > 500 && salesCnt <= 1000) {
                comission = 0.075;
            } else if (salesCnt > 1000 && salesCnt <= 10000) {
                comission = 0.1;
            } else if (salesCnt > 10000) {
                comission = 0.13;

            }
            totalPrice = comission * salesCnt;
            System.out.printf("%.2f", totalPrice);
        } else if (city.equals("Plovdiv")) {
                    if (salesCnt >= 0 && salesCnt <= 500) {
                        comission = 0.055;
                    } else if (salesCnt > 500 && salesCnt <= 1000) {
                        comission = 0.08;
                    } else if (salesCnt > 1000 && salesCnt <= 10000) {
                        comission = 0.12;
                    } else if (salesCnt > 10000) {
                        comission = 0.145;
                    } totalPrice = comission * salesCnt;
            System.out.printf("%.2f", totalPrice);
                }
            }
        }


