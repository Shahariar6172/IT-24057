import java.util.Scanner;
public class Ch2Ex21 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Please enter the annual interest rate: e.g. 5");
        double annualInterestRate = input.nextDouble();
        System.out.println("Please enter the number of years that you want to invest: ");
        double numberofYears = input.nextDouble();
        double futureInvestmentValue = investmentAmount * Math.pow(1 + (annualInterestRate/1200), numberofYears*12);
        futureInvestmentValue = Math.round(futureInvestmentValue*100)/100.0;
        System.out.println("Future value is: " + futureInvestmentValue);
        
    }
}