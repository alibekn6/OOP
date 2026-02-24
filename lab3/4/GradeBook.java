import java.util.ArrayList;

public class GradeBook {
    private Course course;
    private ArrayList<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }

    public GradeBook(Course course, ArrayList<Student> students) {
        this.course = course;
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public double determineClassAverage() {
        if (students.isEmpty()) return 0;
        double sum = 0;
        for (Student s : students) {
            sum += s.getGrade();
        }
        return sum / students.size();
    }

    private Student findStudentWithHighestGrade() {
        if (students.isEmpty()) return null;
        Student best = students.get(0);
        for (Student s : students) {
            if (s.getGrade() > best.getGrade()) {
                best = s;
            }
        }
        return best;
    }

    private Student findStudentWithLowestGrade() {
        if (students.isEmpty()) return null;
        Student worst = students.get(0);
        for (Student s : students) {
            if (s.getGrade() < worst.getGrade()) {
                worst = s;
            }
        }
        return worst;
    }

    public void outputBarChart() {
        int[] frequency = new int[11];

        for (Student s : students) {
            int grade = s.getGrade();
            if (grade == 100) {
                frequency[10]++;
            } else {
                frequency[grade / 10]++;
            }
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i <= 10; i++) {
            if (i == 10) {
                System.out.print("100: *");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for (int j = 0; j < frequency[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        
        }

        
    }

    public void displayGradeReport() {
        if (students.isEmpty()) {
            System.out.println("No students in the grade book.");
            return;
        }

        System.out.println();
        double average = determineClassAverage();
        Student best = findStudentWithHighestGrade();
        Student worst = findStudentWithLowestGrade();

        System.out.printf("Class average is %.2f. ", average);
        System.out.println("Lowest grade is " + worst.getGrade() +
                " (" + worst.getName() + ", id: " + worst.getId() + ").");
        System.out.println("Highest grade is " + best.getGrade() +
                " (" + best.getName() + ", id: " + best.getId() + ").");
        System.out.println();
        outputBarChart();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "GradeBook{course=" + course + ", students=" + students.size() + "}";
    }
}