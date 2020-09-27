import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongsMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String typeList = "";
        String songName = "";
        String duration = "";

        List<Songs> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = scan.nextLine().split("_");
            typeList = parts[0];
            songName = parts[1];
            duration = parts[2];
            Songs song = new Songs(typeList, songName, duration);
            list.add(song);
        }

        String requiredType = scan.nextLine();

        if (requiredType.equals("all")) {
            for (Songs songs : list) {
                System.out.println(songs.songName);
            }

        } else {

            for (Songs songs : list) {
                if (songs.listType.equals(requiredType)) {
                    System.out.println(songs.songName);
                }
            }
        }
    }
}
