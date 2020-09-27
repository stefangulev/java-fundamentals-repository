import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int firstEmployeeCapacityPerHour = Integer.parseInt(scan.nextLine());
        int secondEmployeeCapacityPerHour = Integer.parseInt(scan.nextLine());
        int thirdEmployeeCapacityPerHour = Integer.parseInt(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());

        int countHours = 0;
        int allEmployeesCapacityPerHour = firstEmployeeCapacityPerHour + secondEmployeeCapacityPerHour + thirdEmployeeCapacityPerHour;
        int totalStudentsHandled = 0;

        while (totalStudentsHandled < studentsCount) {
            countHours++;
            if(countHours % 4 ==0) {
                countHours++;
            }
            totalStudentsHandled += allEmployeesCapacityPerHour;
        }

        System.out.printf("Time needed: %dh.", countHours);
    }
}
