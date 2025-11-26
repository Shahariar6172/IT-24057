import java.util.Scanner;
public class Ch3Ex23 {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: e.g. x y ");
        double x = input.nextDouble();
        double y  = input.nextDouble();
            if (-5 <= x && x <= 5 && -2.5 <= y && y <= 2.5)
            System.out.println("The cordinate (" + x + "," + y + ")  is in the rectangle.");
        else
            System.out.println("The cordinate (" + x + "," + y + ")  is not in the rectangle.");

    }
}