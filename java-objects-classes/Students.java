import java.util.List;

public class Students {
    String firstName;
    String lastName;
    int age;
    String hometown;

    Students (String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public String getHometown() {
        return this.hometown;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }


}
