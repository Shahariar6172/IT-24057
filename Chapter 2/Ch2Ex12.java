import java.util.Scanner;
import java.lang.Math;
public class Ch2Ex12 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter take off speed: ");
        double v = input.nextDouble();
        System.out.println("Please enter airplane's acceleration: ");
        double a = input.nextDouble();
        double length = Math.pow(v,2)/(2*a);
        System.out.println("Minimum ranaway length for plane the take off is: " + length);  
              
    }
}