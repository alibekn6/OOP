public class Account {
  public static void main(String[] args) {
    double init = 1000.0;
    double intRate = 0.05; // 5%

    double interestEarned = init * intRate;
    double newBalance = init + interestEarned;

    System.out.println("Initial Balance: $" + init);
    System.out.println("Interest Rate: " + (intRate * 100) + "%");
    System.out.println("Interest Added: $" + interestEarned);
    System.out.println("New Balance: $" + newBalance);

  }
}
