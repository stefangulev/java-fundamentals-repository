import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floorsCount = Integer.parseInt(scan.nextLine());
        int roomsPerFloor = Integer.parseInt(scan.nextLine());


        for (int floor = floorsCount; floor > 0; floor--) {
            System.out.println();
            for (int room = 0; room < roomsPerFloor; room++) {

                if (floor == floorsCount) {
                    System.out.printf("L%d%d ", floor, room);


                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor, room);
                } else {
                    System.out.printf("A%d%d ", floor, room);
                }


            }

        }

    }
}








