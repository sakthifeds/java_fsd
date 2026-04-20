package lab2;

public class Person {
    private String name;
    private float age;
    private String phoneNumber;
    private Gender gender;

    public Person() {}

    public Person(String name, float age, String phoneNumber, Gender gender) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void displayDetails() {
        System.out.println(name + " " + age + " " + phoneNumber + " " + gender);
    }

    public enum Gender {
        M, F
    }
}
