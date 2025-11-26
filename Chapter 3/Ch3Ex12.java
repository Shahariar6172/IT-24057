import java.util.Scanner;
public class Ch3Ex12 {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 digit integer");
        int number = input.nextInt();
        if (number < 0)
            number = Math.abs(number);
        int inverseOfNumber = 100 * (number / 100) +
                10 * ((number / 10) % 10) +
                number / 100;
        if ( number == inverseOfNumber)
            System.out.println(number + " is a palindrome ");
        else
            System.out.println(number + " is not a palindrome");




    }
}