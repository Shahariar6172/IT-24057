import java.util.Scanner;
public class Ch3Ex31 {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: 0");
        int status = input.nextInt();
        if (status == 0){
            System.out.println("Enter the dollar amount:");
            double amount = input.nextDouble();
            double money = amount * exchangeRate;
            System.out.println(amount + " usd is " + (int)(money * 100 / 100) + " yuan" );
        } else if (status == 1){
            System.out.println("Enter the RMB amount:");
            double amount = input.nextDouble();
            double money = amount / exchangeRate;
            System.out.println(amount + " yuan is " + (int)(money * 100 / 100) + " usd" );
        }

    }
}