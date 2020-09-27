package Students;

import Students.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Students> listOfStudents = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            String[] personalInformation = scan.nextLine().split("\\s+");
            String firstName = personalInformation[0];
            String lastName = personalInformation[1];
            double grade = Double.parseDouble(personalInformation[2]);
            Students student = new Students(firstName, lastName, grade);
            listOfStudents.add(student);

        }

        listOfStudents.stream().sorted((s1,s2) -> s2.getGrade().compareTo(s1.getGrade())).forEach(System.out::println);





    }
}
