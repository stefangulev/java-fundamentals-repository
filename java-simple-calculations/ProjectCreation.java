import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int projectCnt = Integer.parseInt(scan.nextLine());
        int timeNeeded = projectCnt * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name , timeNeeded, projectCnt);
    }
}
