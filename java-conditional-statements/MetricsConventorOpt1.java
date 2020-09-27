import java.util.Scanner;

public class MetricsConventorOpt1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double value = Double.parseDouble(scan.nextLine());
        double converted = 0;
        String metricsEntry = scan.nextLine();
        String metricsExit = scan.nextLine();

        if (metricsEntry.equals("m") && metricsExit.equals("mm")) {
            converted = value * 1000;

        } else if (metricsEntry.equals("m") && metricsExit.equals("cm")) {
            converted = value * 100;

        }
        if (metricsEntry.equals("cm") && metricsExit.equals("mm")) {
            converted = value * 10;
        } else if (metricsEntry.equals("cm") && metricsExit.equals("m")) {
            converted = value / 100;
        }
        if (metricsEntry.equals("mm") && metricsExit.equals("cm")) {
            converted = value / 10;
        } else if (metricsEntry.equals("mm") && metricsExit.equals("m")) {
            converted = value / 1000;

        }
        System.out.printf("%.3f", converted);
    }
}
