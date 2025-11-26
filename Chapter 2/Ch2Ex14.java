import java.util.Scanner;
public class Ch2Ex14 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight in kg: e.g. 80.67 ");
        double weight = input.nextDouble();
        System.out.println("Please enter your height in meters: e.g 1.80 ");
        double height = input.nextDouble();
        double BMI = weight/(Math.pow(height,2));
        System.out.println("Your BMI is: " + BMI);
    }
}