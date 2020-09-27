import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();

        if (figure.equals("square")) {
            double a = Double.parseDouble(scan.nextLine());
            double area = a * a;
            System.out.printf("%.3f", area);
        } else if(figure.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            double area = a * b;
            System.out.printf("%.3f", area);
        } else if(figure.equals("circle")) {
            double r = Double.parseDouble(scan.nextLine());
            double area = Math.PI * r* r;
            System.out.printf("%.3f", area);
        } else if(figure.equals("triangle")) {
            double h = Double.parseDouble(scan.nextLine());
            double a = Double.parseDouble(scan.nextLine());
            double area = h * a / 2;
            System.out.printf("%.3f", area);

        }

    }
}
