package lab1;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person("John", "Doe", Person.Gender.M, "1234567890");
        p.display();
    }
}

