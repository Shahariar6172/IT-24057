import java.util.Scanner;
public class Ch2Ex10 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the amount of water in kg: ");
        double M = input.nextDouble();
        System.out.println("enter initial temp of the water: ");
        double initialTemperature = input.nextDouble();
        System.out.println("enter the final temp of the water: ");
        double finalTemperature = input.nextDouble();
        double Q = M*(finalTemperature - initialTemperature)*4184;
        System.out.println("The energy needed is: " + Q + "joules");

    }

}