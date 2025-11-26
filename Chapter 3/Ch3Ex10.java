import java.util.Scanner;
public class Ch3Ex10 {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOne = (int)(Math.random() * 100);
        int numberTwo = (int)(Math.random() * 100);
        System.out.println("What is " + numberOne + " + " + numberTwo + " ?");
        int answer = input.nextInt();
        if (numberOne + numberTwo == answer)
            System.out.println("You are correct!");
        else
            System.out.println(numberOne + " + " + numberTwo + " should be " + (numberOne + numberTwo));
    }

}