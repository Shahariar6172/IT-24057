import java.util.Scanner;
public class Ch3Ex11 {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of the month: ");
        int month = input.nextInt();
        System.out.println("Please enter the year ");
        int year = input.nextInt();
        String[] months = {"", "January" , "February", "March", "April", "May", "June",
                "July", "August", "September", "October","November", "December"};
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean thirtyDayOfMonth = month % 2 == 0;
        if (isLeapYear == true && thirtyDayOfMonth == true && month == 2)
            System.out.println(months[month] + " " + year + " has 29 days");
        else if (isLeapYear == true && thirtyDayOfMonth == true)
            System.out.println(months[month] + " " + year + " has 30 days");
        else if (isLeapYear == false && month == 2)
            System.out.println(months[month] + " " + year + " has 28 days");
        else
            System.out.println(months[month] + " " + year + " has 31 days");

    }
}