import java.util.Scanner;
public class Ch3Ex26 {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean d5 = number % 5 == 0;
        boolean d6 = number % 6 == 0;
        boolean d5Andd6 = d5 & d6;
        if (d5 == true & d6 == true)
        System.out.println("Is " + number + " divisible by 5 and 6 ? " + d5Andd6);

    }
}