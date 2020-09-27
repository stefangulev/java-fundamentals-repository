package Person;

import Person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] personalInfo = scan.nextLine().split("\\s+");
            String name = personalInfo[0];
            int age = Integer.parseInt(personalInfo[1]);
            Person person = new Person(name, age);
            if (person.getAge() > 30) {
                people.add(person);
            }

        }
        people.stream().sorted((p1 ,p2) -> p1.getName().compareTo(p2.getName())).forEach
                (p -> System.out.println(p.getName() + " - " + p.getAge()));
    }
}
