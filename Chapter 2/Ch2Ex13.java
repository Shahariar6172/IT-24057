import java.util.Scanner;

public class Ch2Ex13 {
       public static void main(String[] args) {
       final double MONTHTLYINTERESRATE = 0.05/12;
       Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of saving: ");
        double monthlySavingAmount = input.nextDouble();
        System.out.println("Please enter the number of months: ");
        int numberMonths = input.nextInt();
        double totalAmount = 0;
        for(int i = 1; i <= numberMonths; i++){
        totalAmount = (totalAmount+monthlySavingAmount)*(1 + MONTHTLYINTERESRATE);     
        }
        System.out.print("After month " + numberMonths + "The amount of money in your saving account is: " + totalAmount);
    }
}