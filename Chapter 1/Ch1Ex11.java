public class Ch1Ex11 {
public static void main(String[] args) {
int currentPopulation = 312032486;
int secondsPerYear = 365 * 24 * 60 * 60;
int births = secondsPerYear / 7;
int deaths = secondsPerYear / 13;
int immigrants = secondsPerYear / 45;
int annualChange = births - deaths + immigrants;

for (int year = 1; year <= 5; year++) {
currentPopulation += annualChange;
System.out.println("Year " + year + " population: " + currentPopulation);
}
}
}