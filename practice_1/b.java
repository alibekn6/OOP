import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the side length a of  the square: ");
       
        double a = sc.nextDouble();
        if (a <= 0) {
            System.out.println("Error: Side length must be a positive number.");
        } else {
            double area = a * a;

            double perimeter = 4 * a;
            
            double diagonal = a * Math.sqrt(2);

            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.printf("Length of diagonal: %.2f", diagonal);
    
        }

        sc.close();
    }
}
