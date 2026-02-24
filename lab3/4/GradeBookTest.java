import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course course = new Course("CS101 Object-oriented Programming and Design",
                "Introduction to OOP", 3, "None");

        GradeBook gradeBook = new GradeBook(course);
        gradeBook.displayMessage();

        System.out.println("Input grades for students:");

        String[] names = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (int i = 0; i < names.length; i++) {
            System.out.print("Student " + names[i] + ": ");
            int grade = scanner.nextInt();
            gradeBook.addStudent(new Student("Student " + names[i], grade));
        }

        gradeBook.displayGradeReport();
        scanner.close();
    }
}
