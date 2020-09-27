import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Double>> studentsInformation = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n ; i++) {
            String studentName = scan.nextLine();
            double studentGrade = Double.parseDouble(scan.nextLine());

            studentsInformation.putIfAbsent(studentName, new ArrayList<>());
            List<Double> currentGrade = studentsInformation.get(studentName);
            currentGrade.add(studentGrade);
        }

        studentsInformation.entrySet().stream().filter(e -> e.getValue().stream().mapToDouble(Double::doubleValue).
                average().getAsDouble() >= 4.5).sorted((s1, s2) -> {
                    double first = s1.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    double second = s2.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    return Double.compare(second, first);

        }).forEach(s -> System.out.println(String.format("%s -> %.2f", s.getKey(), s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble())));




    }
}
