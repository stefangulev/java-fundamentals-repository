import java.util.Scanner;

public class Histrogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int currentNumber = 0;
        double p1Cnt = 0;
        double p2Cnt = 0;
        double p3Cnt = 0;
        double p4Cnt = 0;
        double p5Cnt = 0;

        for (int i = 1; i <= n; i++) {
            currentNumber = Integer.parseInt(scan.nextLine());
            if (currentNumber < 200) {
                p1Cnt = p1Cnt + 1; //p1+=1
            } else if (currentNumber >= 200 && currentNumber <= 399) {
                p2Cnt = p2Cnt + 1; //p2+=1
            } else if (currentNumber >= 400 && currentNumber <= 599) {
                p3Cnt = p3Cnt + 1; //p3+=1
            } else if (currentNumber >= 600 && currentNumber <= 799) {
                p4Cnt = p4Cnt + 1; //p4+=1

            } else if (currentNumber >= 800) {
                p5Cnt = p5Cnt + 1; //p5+=1
            }

        }
        double p1Percentage = p1Cnt / n * 100;
        double p2Percentage = p2Cnt / n * 100;
        double p3Percentage = p3Cnt / n * 100;
        double p4Percentage = p4Cnt / n * 100;
        double p5Percentage = p5Cnt / n * 100;

        System.out.printf("%.2f%%%n", p1Percentage);
        System.out.printf("%.2f%%%n", p2Percentage);
        System.out.printf("%.2f%%%n", p3Percentage);
        System.out.printf("%.2f%%%n", p4Percentage);
        System.out.printf("%.2f%%%n", p5Percentage);
    }


}


