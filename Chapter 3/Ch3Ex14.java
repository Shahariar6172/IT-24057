import java.util.Scanner;
public class Ch3Ex14 {
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double randomNumber = Math.random();
        if (randomNumber < 0.5)
            randomNumber = 0;
        else
            randomNumber = 1;
        System.out.println("Head or Tail ? Please enter 0 for Head and 1 for Tail");

        byte headOrTail = input.nextByte();
        if (headOrTail == 1 || headOrTail == 0)
            System.out.println((randomNumber == headOrTail)? "Your guess is correct!" :"Your guess is incorrect");
        else
            System.out.println("Invalid entry please enter 0 for Head and 1 for Tail");


    }
}