import java.util.Scanner;
public class Ch3Ex22 {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: e.g. x y ");
        double x = input.nextDouble();
        double y  = input.nextDouble();
        double circle = x * x + y * y;
        if (circle <= 100) {
            System.out.println("The cordinate (" + x + "," + y + ")  is in the circle.");
        }
        else
            System.out.println("The cordinate (" + x + "," + y + ")  is not in the circle." );

    }
}