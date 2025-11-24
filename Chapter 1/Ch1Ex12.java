public class Ch1Ex12 {
public static void main(String[] args) {
double miles = 24;
int minutes = 40;
int seconds = 35;


double hours = minutes / 60.0 + seconds / 3600.0;
double kilometers = miles * 1.6;
double speed = kilometers / hours;


System.out.println("Average speed in kilometers per hour: " + speed);
}
}