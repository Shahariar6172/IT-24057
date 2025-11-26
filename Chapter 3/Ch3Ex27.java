import java.util.Scanner;
public class Ch3Ex27 {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point’s x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
               if (y + (x / 2) <= 100)
            System.out.println("The point is in the triangle");
        else if (x < 0 || y < 0)
            System.out.println("The point is not in the triangle");
        else
            System.out.println("The point is not in the triangle");
    }
}