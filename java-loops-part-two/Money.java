import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = Double.parseDouble(scan.nextLine());
        double sumInCoins = sum * 100;
        int coinsCount = 0;

        while (sumInCoins > 0.01) {

            if (sumInCoins >= 200) {
                sumInCoins = sumInCoins - 200;
                coinsCount++;

            }
            else if (sumInCoins >= 100) {
                sumInCoins = sumInCoins - 100;
                coinsCount++;

            }
            else if (sumInCoins >= 50) {
                sumInCoins = sumInCoins - 50;
                coinsCount++;
            }
           else if (sumInCoins >= 20) {
                sumInCoins = sumInCoins - 20;
                coinsCount++;
            }
            else if (sumInCoins >=10) {
                sumInCoins = sumInCoins - 10;
                coinsCount++;
            }
            else if (sumInCoins >= 5) {
                sumInCoins = sumInCoins - 5;
                coinsCount++;
            }
            else if (sumInCoins >=2) {
                sumInCoins = sumInCoins - 2;
                coinsCount++;
            }
            else if (sumInCoins == 1) {
                sumInCoins = sumInCoins - 1;
                coinsCount++;
            }
        }
        System.out.println(coinsCount);


    }
}
