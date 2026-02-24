public class Person {
    private Gender gender;
    private String name;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "(" + (gender == Gender.BOY ? "B" : "G") + ")";
    }
}