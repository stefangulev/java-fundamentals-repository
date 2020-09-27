import java.util.Scanner;

public class TubesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int poolSizeLitres = Integer.parseInt(scan.nextLine());
        int tubeOneDebitPerHour = Integer.parseInt(scan.nextLine());
        int tubeTwoDebitPerHour = Integer.parseInt(scan.nextLine());
        double breakTimePerHour = Double.parseDouble(scan.nextLine());

        double tubeOneInput = tubeOneDebitPerHour * breakTimePerHour;
        double tubeOTwoInput = tubeTwoDebitPerHour * breakTimePerHour;
        double bothTubesInput = tubeOneInput + tubeOTwoInput;

        double percentageTubeOne = (tubeOneInput / bothTubesInput) * 100;
        double percentageTubeTwo = (tubeOTwoInput / bothTubesInput) * 100;
        double howFullIsPool = (bothTubesInput/poolSizeLitres) * 100;
        //double overFill = bothTubesInput - poolSizeLitres;

        if (bothTubesInput <= poolSizeLitres) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%." , howFullIsPool , percentageTubeOne , percentageTubeTwo);

        } else if (bothTubesInput > poolSizeLitres) {
            howFullIsPool = howFullIsPool - poolSizeLitres;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", breakTimePerHour , howFullIsPool);
        }


    }
}
