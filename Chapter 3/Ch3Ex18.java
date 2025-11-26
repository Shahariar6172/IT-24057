import java.util.Scanner;
public class Ch3Ex18 {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weight in pounds");
        double weight = input.nextDouble();
        if (weight <= 0)
            System.out.println("Invalid input");
        else if (0 < weight && weight <= 1)
            System.out.println("The cost of the shipment is 3.50 usd");
        else if (1 < weight && weight <= 3)
            System.out.println("The cost of the shipment is 5.50 usd");
        else if (3 < weight && weight <= 10)
            System.out.println("The cost of the shipment is 8.50 usd");
        else if (10 < weight && weight <= 20)
            System.out.println("The cost of the shipment is 10.50 usd");
        else
            System.out.println("The package cannot be shipped");
    }
}