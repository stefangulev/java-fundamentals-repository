import java.util.Scanner;

public class SalaryMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        for (int i = 0; i<n; i++) {
            String currentTab = scan.nextLine();

            if (currentTab.equals("Facebook")) {
                salary = salary - 150;
            } else if (currentTab.equals("Instagram")) {
                salary = salary - 100;
            } else if (currentTab.equals("Reddit")) {
                salary = salary - 50;
            }
            if (salary <= 0) {
                break;
            }
        }
        if (salary <=0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }


    }
}
