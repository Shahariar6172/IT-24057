import java.util.Scanner;
public class Ch3Ex17 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerChoice = (int)(Math.random() * 3);
        System.out.println("scissor (0), rock (1), paper (2): ");
        int userChoice = input.nextInt();
        String[] rockScissorPaper = {"scissor", "rock", "paper"};
        if (computerChoice == 0 && userChoice ==2)
            System.out.println(" The computer is scissor. You are paper. You lost");
        else if (computerChoice == 0 && userChoice == 1)
            System.out.println(" The computer is scissor. You are rock. You won");
        else if (computerChoice == 1 && userChoice == 0)
            System.out.println(" The computer is rock. You are scissor. You lost");
        else if (computerChoice == 1 && userChoice == 2)
            System.out.println(" The computer is rock. You are paper. You won");
        else if (computerChoice == 2 && userChoice == 0)
            System.out.println(" The computer is paper. You are scissor. You won");
        else if (computerChoice == 2 && userChoice == 1)
            System.out.println(" The computer is paper. You are rock. You lost");
        else
            System.out.println(" The computer is " + rockScissorPaper[computerChoice] +
                    ". You are " + rockScissorPaper[userChoice] + " too. " +
                    " It is a draw" );

    }
}