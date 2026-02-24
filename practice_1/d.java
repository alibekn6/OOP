import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");

        double a = sc.nextDouble();
        
        double b = sc.nextDouble();
        
        double c = sc.nextDouble();

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant < 0) {
            System.out.println("Error: Discriminant is negative!!!");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation root is : " + root);
        } else {
            double sqrtD = Math.sqrt(discriminant);
            double root1 = (-b + sqrtD) / (2 * a);
            double root2 = (-b - sqrtD) / (2 * a);
            System.out.println("root  1:  " + root1);
            System.out.println("root  2:  " + root2);
        }
        sc.close();
    }
}
