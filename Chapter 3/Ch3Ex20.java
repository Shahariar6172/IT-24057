import java.util.Scanner;
import java.util.Scanner;
public class Ch3Ex20 {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58\u00B0F and 41\u00B0F:");
        double temperature = input.nextDouble();
        System.out.println("Enter the wind speed ( >= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();
        double windChillTemperatute = 35.74 + 0.6215*temperature - 35.75*Math.pow(windSpeed,0.16) + 0.4275*temperature*Math.pow(windSpeed, 0.16);
        if (-58 < temperature && temperature < 41 && windSpeed >= 2)
            System.out.println("The wind chill temperature is: " + windChillTemperatute);
        else
            System.out.println("Invalid input! ");
    }
}