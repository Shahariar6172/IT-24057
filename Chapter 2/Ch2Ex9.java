import java.util.Scanner;
public class Ch2Ex9 {
        public static void main(String[] args) {
        double v1, v0, t;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter v0 v1 and t");
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();
        double a = (v1-v0)/t;
        System.out.println("The average acceleartion is: " + a);
    }
}