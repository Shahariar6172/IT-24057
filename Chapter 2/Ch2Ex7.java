import java.util.Scanner;
public class Ch2Ex7 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the minutes");
        long minutes = input.nextLong();
        long years = minutes/(365*24*60); /*Denominator is implying the number of minutes in a year */
        long remainingMinutes = minutes % (365*24*60);
        long remainingDays = remainingMinutes / (23*60);
        System.out.println(minutes + " is approx. " + years + " Years and " + remainingDays + "days" );  
    }
}