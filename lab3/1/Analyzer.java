import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("enter number (Q to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                data.addValue(value);
            } catch (NumberFormatException e) {
                System.out.println("not correct input, pls enter a number or Q (quit)");
            }
        }

        if (data.getCount() > 0) {
            System.out.println("avg = " + data.getAverage());
            System.out.println("max = " + data.getMax());
        } else {
            System.out.println("no data");
        }

        scanner.close();
    }
}