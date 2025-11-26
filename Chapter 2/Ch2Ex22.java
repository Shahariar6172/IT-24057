import java.util.Scanner;
public class Ch2Ex22 {
public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount as an integer, e.g., 1156: ");
        int amount = input.nextInt();
        int dollars = amount / 100;
        int cents = amount % 100;
        System.out.println("The amount consists of:");
        System.out.println("  " + dollars + " dollars");
        System.out.println("  " + cents + " cents");
    }
}
