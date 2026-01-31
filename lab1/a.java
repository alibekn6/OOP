import java.util.Scanner;

public class PrintMyName {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter your name: ");
      
      String name = scanner.nextLine();

      int n = name.length();
        
    
      System.out.print("+");
      for (int i = 0; i < n + 2; i++) {
        System.out.print("-");
      }

      System.out.println("+");

      System.out.println("| " + name + " |");

      System.out.print("+");
        
      for (int i = 0; i < n + 2; i++) {
        System.out.print("-");
      }


      System.out.println("+");
        
    
      scanner.close();
    }

}
