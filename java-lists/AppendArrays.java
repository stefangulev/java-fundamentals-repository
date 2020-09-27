import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] parts = scan.nextLine().split("\\|");
        List<String> completed = new ArrayList<>();

        for (int i = parts.length - 1; i >= 0; i--) {
            String[] temp = parts[i].split("\\s+");
            for (String s : temp) {
                if (!"".equals(s)) {
                    completed.add(s);
                }
            }

        }


        for (String s : completed) {
            System.out.print(s + " ");
        }


    }
}
