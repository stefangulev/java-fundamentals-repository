import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scan.nextLine());
        int fansCount = Integer.parseInt(scan.nextLine());
        int countA = 0;
        int countB = 0;
        int countV = 0;
        int countG = 0;

        for (int i = 0; i < fansCount; i++) {
            String input = scan.nextLine();

            if (input.equals("A")) {
                countA++;

            } else if(input.equals("B")){
                countB++;
            } else if(input.equals("V")) {
                countV++;
            } else if (input.equals("G")) {
                countG++;
            }

        } double percentageFansA = 1.0 * countA / fansCount * 100;
        double percentageFansB = 1.0 * countB / fansCount * 100;
        double percentageFansV = 1.0 * countV / fansCount * 100;
        double percentageFansG = 1.0 * countG / fansCount * 100;
        double percentageAllFangs = 1.0 *(countA + countB + countV + countG) / stadiumCapacity * 100;

        System.out.printf("%.2f%%%n", percentageFansA);
        System.out.printf("%.2f%%%n", percentageFansB);
        System.out.printf("%.2f%%%n", percentageFansV);
        System.out.printf("%.2f%%%n", percentageFansG);
        System.out.printf("%.2f%%%n", percentageAllFangs);
        }
    }

