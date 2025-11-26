import java.util.Scanner;
public class Ch3Ex15 {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int lottery = (int)(Math.random() * 1000);       
        System.out.println("Please enter the lottery number: ");
        int userTicketNumber = input.nextInt();
        int firstDigitLottery = lottery / 100;
        int secondDigitLottery = (lottery / 10) % 10;
        int lastDigitLottery = lottery % 10;
        int firstDigitUser = userTicketNumber / 100;
        int secondDigitUser = (userTicketNumber / 10) % 10;
        int lastDigitUser = userTicketNumber % 10;
        System.out.println("The lottery number is: " + lottery);
        System.out.println("Your ticket number is: " + userTicketNumber);
        if (lottery == userTicketNumber) {
            System.out.println("Congrats! you won 10,000 usd!");
        } else if ((firstDigitUser == firstDigitLottery || firstDigitUser == secondDigitLottery || firstDigitUser == lastDigitLottery) &&
                (secondDigitUser == firstDigitLottery || secondDigitUser == secondDigitLottery || secondDigitUser == lastDigitLottery) &&
                (lastDigitUser == firstDigitLottery || lastDigitUser == secondDigitLottery || lastDigitUser == lastDigitLottery))
            System.out.println("Match all digits: you win 3,000 usd!");
        else if ((firstDigitUser == firstDigitLottery || firstDigitUser == secondDigitLottery || firstDigitUser == lastDigitLottery) ||
                (secondDigitUser == firstDigitLottery || secondDigitUser == secondDigitLottery || secondDigitUser == lastDigitLottery) ||
                (lastDigitUser == firstDigitLottery || lastDigitUser == secondDigitLottery || lastDigitUser == lastDigitLottery))
            System.out.println("Match only one digits: you win 1,000 usd! Please note that there are extra prize for two digit match");
        else
            System.out.println("No match try next time :)");

    }
}