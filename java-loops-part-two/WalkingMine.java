import java.util.Scanner;

public class WalkingMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int sumSteps = 0;
        int stepsToHome = 0;

        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            sumSteps = sumSteps + steps;

            if (sumSteps >= 10000) {
                break;
            }
            input = scan.nextLine();
        }
        if (input.equals("Going home")) {
            input = scan.nextLine();
            stepsToHome = Integer.parseInt(input);
            sumSteps = sumSteps + stepsToHome;

        } if (sumSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
        } else {
            int stepsNeeded = 10000 - sumSteps;
            System.out.printf("%d more steps to reach goal.", stepsNeeded);
        }
    }
}
