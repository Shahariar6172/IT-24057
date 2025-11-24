public class Ch1Ex10 {
public static void main(String[] args) {
double kilometers = 14;
int minutes = 45;
int seconds = 30;


double hours = minutes / 60.0 + seconds / 3600.0;
double miles = kilometers / 1.6;
double speed = miles / hours;


System.out.println("Average speed in miles per hour: " + speed);
}
}