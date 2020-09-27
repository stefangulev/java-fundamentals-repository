import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        int courses = people / capacity;
        int difference = people % capacity;

      while (difference > 0) {

          difference -= capacity;
          courses +=1;
      }
        System.out.println(courses);

    }
}
