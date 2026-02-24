public class Student {
    private String name;
    private int id;
    private int grade;

    private static int nextId = 1;

    public Student(String name) {
        this.name = name;
        this.id = nextId++;
        this.grade = 0;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.id = nextId++;
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }

    @Override
    public String toString() {
        return "Student " + name + ": " + grade;
    }
}