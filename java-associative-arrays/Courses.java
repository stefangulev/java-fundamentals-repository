import java.util.*;
import java.util.stream.Collectors;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> courseList = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] commands = input.split(" : ");
            String course = commands[0];
            String studentName = commands[1];

            courseList.putIfAbsent(course, new ArrayList<>());
            List <String> students = courseList.get(course);
            students.add(studentName);

            input = scan.nextLine();
        }

//        for (Map.Entry<String, List<String>> entry : courseList.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue().size());
//            for (int i = 0; i < entry.getValue().size() ; i++) {
//                System.out.printf("-- %s%n",entry.getValue().get(i));
//            }
        courseList.entrySet().stream().sorted((l, r) -> Integer.compare(r.getValue().size(), l.getValue().size())).forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().stream().sorted((l,r) -> l.compareTo(r)).forEach( s -> System.out.println(String.format("-- %s", s)));
        });
        }
    }

