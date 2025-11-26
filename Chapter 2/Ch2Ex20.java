import java.util.Scanner;
public class Ch2Ex20 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate (e.g., 5 for 5%)");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        double interest = balance * (annualInterestRate/1200);
        System.out.println("Interest amount for the next month is: " + interest);

    }
}