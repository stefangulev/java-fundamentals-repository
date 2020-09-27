package OrderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Person> people = new ArrayList<>();

        while (!input.equals("End")) {
            String[] command = input.split(" ");
            String name = command[0];
            String id = command[1];
            int age = Integer.parseInt(command[2]);

            Person person = new Person(name, id, age);
            people.add(person);

            input = scan.nextLine();
        }

        people.stream().sorted((p1, p2) -> p1.getAge().compareTo(p2.getAge())).forEach(System.out::println);
    }
}
