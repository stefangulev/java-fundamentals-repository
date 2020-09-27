import java.util.Scanner;

public class RageExpenses {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scan.nextLine());
        double headSetPrice = Double.parseDouble(scan.nextLine());
        double mouseSetPrice = Double.parseDouble(scan.nextLine());
        double keyboardSetPrice = Double.parseDouble(scan.nextLine());
        double displaySetPrice = Double.parseDouble(scan.nextLine());

        int headSetTrashCount = 0;
        int mouseTrashCount = 0;
        int keyboardTrashCount = 0;
        int displayTrashCount = 0;

        for (int i = 1; i <= lostGamesCount ; i++) {


            if (i % 2 == 0 && i % 3 == 0) {
                headSetTrashCount++;
                mouseTrashCount++;
                keyboardTrashCount++;
                if (keyboardTrashCount % 2 ==0) {
                    displayTrashCount++;
                }
            }
            else if (i % 2 == 0) {
                headSetTrashCount++;
            } else if (i % 3 == 0) {
                mouseTrashCount++;
            }
        }

        double total = (headSetTrashCount * headSetPrice) + (mouseTrashCount * mouseSetPrice) + (keyboardTrashCount * keyboardSetPrice)
                + (displayTrashCount * displaySetPrice);

        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
